/*
  Arduino Yún USB-to-Serial

  Allows you to use the Yun Shield/Yún processor as a
  serial terminal for the Linux side on the Yún.

  Upload this to a Yun Shield/Yún via serial (not WiFi) then open
  the Serial Monitor at 115200 to see the boot process of Linux.
  You can also use the Serial Monitor as a basic command line
  interface for Linux using this sketch.

  From the Serial Monitor the following commands can be issued:

  '~' followed by '0' -> Set the UART speed to 57600 baud
  '~' followed by '1' -> Set the UART speed to 115200 baud
  '~' followed by '2' -> Set the UART speed to 250000 baud
  '~' followed by '3' -> Set the UART speed to 500000 baud
  '~' followed by '~' -> Sends the bridge's shutdown command to
                        obtain the console.

  The circuit:
   Yun Shield/Yún

  created March 2013
  by Massimo Banzi
  modified by Cristian Maglie

  This example code is in the public domain.

  https://www.arduino.cc/en/Tutorial/LibraryExamples/YunSerialTerminal

*/

long linuxBaud = 250000;

void setup() {
  SERIAL_PORT_USBVIRTUAL.begin(115200);  // open serial connection via USB-Serial
  SERIAL_PORT_HARDWARE.begin(linuxBaud); // open serial connection to Linux
}

bool commandMode = false;

void loop() {
  // copy from USB-CDC to UART
  int c = SERIAL_PORT_USBVIRTUAL.read();    // read from USB-CDC
  if (c != -1) {                            // got anything?
    if (commandMode == false) {             // if we aren't in command mode...
      if (c == '~') {                       //    Tilde '~' key pressed?
        commandMode = true;                 //       enter in command mode
      } else {
        SERIAL_PORT_HARDWARE.write(c);      //    otherwise write char to UART
      }
    } else {                                // if we are in command mode...
      if (c == '0') {                       //     '0' key pressed?
        SERIAL_PORT_HARDWARE.begin(57600);  //        set speed to 57600
        SERIAL_PORT_USBVIRTUAL.println("Speed set to 57600");
      } else if (c == '1') {                //     '1' key pressed?
        SERIAL_PORT_HARDWARE.begin(115200); //        set speed to 115200
        SERIAL_PORT_USBVIRTUAL.println("Speed set to 115200");
      } else if (c == '2') {                //     '2' key pressed?
        SERIAL_PORT_HARDWARE.begin(250000); //        set speed to 250000
        SERIAL_PORT_USBVIRTUAL.println("Speed set to 250000");
      } else if (c == '3') {                //     '3' key pressed?
        SERIAL_PORT_HARDWARE.begin(500000); //        set speed to 500000
        SERIAL_PORT_USBVIRTUAL.println("Speed set to 500000");
      } else if (c == '~') {                //     '~` key pressed?
        SERIAL_PORT_HARDWARE.write((uint8_t *)"\xff\0\0\x05XXXXX\x7f\xf9", 11); // send "bridge shutdown" command
        SERIAL_PORT_USBVIRTUAL.println("Sending bridge's shutdown command");
      } else {                              //     any other key pressed?
        SERIAL_PORT_HARDWARE.write('~');    //        write '~' to UART
        SERIAL_PORT_HARDWARE.write(c);      //        write char to UART
      }
      commandMode = false;                  //     in all cases exit from command mode
    }
  }

  // copy from UART to USB-CDC
  c = SERIAL_PORT_HARDWARE.read();          // read from UART
  if (c != -1) {                            // got anything?
    SERIAL_PORT_USBVIRTUAL.write(c);        //    write to USB-CDC
  }
}
