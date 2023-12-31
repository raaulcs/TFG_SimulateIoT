/*
  Time Check

 Gets the time from Linux via Bridge then parses out hours,
 minutes and seconds using a Yun Shield/Yún.

 created  27 May 2013
 modified 21 June 2013
 By Tom Igoe

 This example code is in the public domain.

 https://www.arduino.cc/en/Tutorial/LibraryExamples/TimeCheck

 */


#include <Process.h>

Process date;                 // process used to get the date
int hours, minutes, seconds;  // for the results
int lastSecond = -1;          // need an impossible value for comparison

void setup() {
  Bridge.begin();        // initialize Bridge
  SerialUSB.begin(9600);    // initialize serial

  while (!Serial);              // wait for Serial Monitor to open
  SerialUSB.println("Time Check");  // Title of sketch

  // run an initial date process. Should return:
  // hh:mm:ss :
  if (!date.running()) {
    date.begin("date");
    date.addParameter("+%T");
    date.run();
  }
}

void loop() {

  if (lastSecond != seconds) { // if a second has passed
    // print the time:
    if (hours <= 9) {
      SerialUSB.print("0");  // adjust for 0-9
    }
    SerialUSB.print(hours);
    SerialUSB.print(":");
    if (minutes <= 9) {
      SerialUSB.print("0");  // adjust for 0-9
    }
    SerialUSB.print(minutes);
    SerialUSB.print(":");
    if (seconds <= 9) {
      SerialUSB.print("0");  // adjust for 0-9
    }
    SerialUSB.println(seconds);

    // restart the date process:
    if (!date.running()) {
      date.begin("date");
      date.addParameter("+%T");
      date.run();
    }
  }

  //if there's a result from the date process, parse it:
  while (date.available() > 0) {
    // get the result of the date process (should be hh:mm:ss):
    String timeString = date.readString();

    // find the colons:
    int firstColon = timeString.indexOf(":");
    int secondColon = timeString.lastIndexOf(":");

    // get the substrings for hour, minute second:
    String hourString = timeString.substring(0, firstColon);
    String minString = timeString.substring(firstColon + 1, secondColon);
    String secString = timeString.substring(secondColon + 1);

    // convert to ints,saving the previous second:
    hours = hourString.toInt();
    minutes = minString.toInt();
    lastSecond = seconds;          // save to do a time comparison
    seconds = secString.toInt();
  }

}
