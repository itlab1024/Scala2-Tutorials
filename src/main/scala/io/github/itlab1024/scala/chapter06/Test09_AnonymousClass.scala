package io.github.itlab1024.scala.chapter06

abstract class Test09_AnonymousClass {
  var name: String
  def f1()
}
object Test09_AnonymousClass {
  def main(args: Array[String]): Unit = {
    new Test09_AnonymousClass {
      override var name: String = ""

      override def f1(): Unit = {}
    }
  }
}

