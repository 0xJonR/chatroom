package backend_model

import scala.collection.mutable

class Chatroom {
  //Chatroom class will hold all messages in a linkedlist of string
  // Displaying all messages will be O(n)
  // Sending messages O(1)
  var messages = new mutable.MutableList[String]

  def addMessage(msg: String): Unit = this.messages += msg

  def toOneString(): String = {
    val delimiter = "~"
    var sb: mutable.StringBuilder = new mutable.StringBuilder()
    messages.foreach((s: String) => sb ++= s + delimiter)
    sb.toString()
  }
}
