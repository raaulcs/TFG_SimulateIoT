import os, subprocess, getpass, platform

PATH_FILE_PY = os.path.dirname(os.path.abspath(__file__))
def replace_line(file_name, line_num, text):
  lines = open(file_name, 'r').readlines()
  lines[line_num] = text
  out = open(file_name, 'w')
  out.writelines(lines)
  out.close()

print ('----------------------------------------------------------------------------------------------------\n')
print ('Start of the Arduino-CLI installation\n')
print ('----------------------------------------------------------------------------------------------------\n')

if platform.system() == 'Linux':
  #os.system('curl -fsSL https://raw.githubusercontent.com/arduino/arduino-cli/master/install.sh | sh')
  os.system('sudo snap install arduino-cli')
  os.system('arduino-cli config init')
  print('')
  os.system('arduino-cli')
  print ('\n----------------------------------------------------------------------------------------------------\n')
  print ('Updating local cache and Arduino libraries (modifying default Arduino-CLI configuration):\n')
  output = subprocess.getoutput('arduino-cli config dump --verbose')
  count = 0
  for line in output.splitlines():
    if (line.find('data:') != -1):
      PATH_ARDUINO = line[line.find('data:')+6:999]
    count += 1
  replace_line(PATH_ARDUINO+'/arduino-cli.yaml', 1, '  additional_urls: [https://arduino.esp8266.com/stable/package_esp8266com_index.json]\n')
  replace_line(PATH_ARDUINO+'/arduino-cli.yaml', 7, '  user: '+PATH_FILE_PY+'\n')
  replace_line(PATH_ARDUINO+'/arduino-cli.yaml', 9, '  enable_unsafe_install: true\n')
  os.system('arduino-cli core update-index')
  os.system('arduino-cli core install arduino:avr')
  os.system('arduino-cli core install esp8266:esp8266')
  print()
  os.system('arduino-cli lib install --zip-path "'+PATH_FILE_PY+'/TinkerKit.zip"')
  os.system('arduino-cli lib install --zip-path "'+PATH_FILE_PY+'/Pubsubclient.zip"')
  os.system('arduino-cli lib install --zip-path "'+PATH_FILE_PY+'/Bridge.zip"')
else:
	print('Error responde: This script should only be run if your operating system is UNIX/Linux')

print ('\n----------------------------------------------------------------------------------------------------')
print ('\nEnd of Arduino-CLI installation\n')
print ('----------------------------------------------------------------------------------------------------\n')
getpass.getpass("Press 'Enter' to continue... ")
print ('\n----------------------------------------------------------------------------------------------------')