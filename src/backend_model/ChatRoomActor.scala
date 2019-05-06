package backend_model

import akka.actor.{Actor, ActorRef}


class ChatRoomActor extends Actor {
  val username: String = null
  val chatroom: ChatRoom = new ChatRoom
  var users: Map[String, ActorRef] = Map()
  case class SentMessage(msg: String)
  case class update()
  override def receive: Receive = {
    case msg: SentMessage =>
      chatroom.addMessage(msg.msg)

    case update: update =>
      sender() ! chatroom.toOneString
  }

}
