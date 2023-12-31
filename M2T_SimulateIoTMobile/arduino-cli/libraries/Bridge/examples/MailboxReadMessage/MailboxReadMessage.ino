/*
  Read Messages from the Mailbox

 This example for the Yun Shield/Yún shows how to
 read the messages queue, called Mailbox, using the
 Bridge library.
 The messages can be sent to the queue through REST calls.
 Append the message in the URL after the keyword "/mailbox".
 Example

 "/mailbox/hello"

 created 3 Feb 2014
 by Federico Vanzati & Federico Fissore

 This example code is in the public domain.

 https://www.arduino.cc/en/Tutorial/LibraryExamples/MailboxReadMessage

 */

#include <Mailbox.h>

void setup() {
  pinMode(13, OUTPUT);
  digitalWrite(13, LOW);
  // Initialize Bridge and Mailbox
  Bridge.begin();
  Mailbox.begin();
  digitalWrite(13, HIGH);

  // Initialize Serial
  SerialUSB.begin(9600);

  // Wait until a Serial Monitor is connected.
  while (!SerialUSB);

  SerialUSB.println("Mailbox Read Message\n");
  SerialUSB.println("The Mailbox is checked every 10 seconds. The incoming messages will be shown below.\n");
}

void loop() {
  String message;

  // if there is a message in the Mailbox
  if (Mailbox.messageAvailable()) {
    // read all the messages present in the queue
    while (Mailbox.messageAvailable()) {
      Mailbox.readMessage(message);
      SerialUSB.println(message);
    }

    SerialUSB.println("Waiting 10 seconds before checking the Mailbox again");
  }

  // wait 10 seconds
  delay(10000);
}
