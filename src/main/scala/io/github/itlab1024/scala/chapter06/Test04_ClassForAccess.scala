package io.github.itlab1024.scala.chapter06

// 定义一个父类
class Test04_ClassForAccess {
  private var idCard: String = "1333x"
  protected var name: String = "itlab"
  var sex: String = "男"
  private[chapter06] var age: Int = 1

  def printInfo(): Unit = {
    println(s"Persion: $idCard $name, $sex $age")
  }
}