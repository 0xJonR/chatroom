package backend_test

import backend_model.ChatRoom
import org.scalatest.FunSuite

class testChatRoom extends FunSuite {
  test("Bare Functionality Of ChatRoom"){
    val testCR: ChatRoom = new ChatRoom
    testCR.addMessage("Peter: I Suck")
    testCR.addMessage("Gary: Really?")
    testCR.addMessage("Mary: That's Crazy")
    println(testCR.toOneString)
  }
}
