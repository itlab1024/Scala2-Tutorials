package io.github.itlab1024.scala.chapter06

class Test05_Method {
  // 定义一个方法
  def method1(): Int = {
    1
  }
}

class subClass extends Test05_Method {
  // 使用override关键字实现函数的重写
  override def method1(): Int = super.method1()
}

object Test05_Method {
  def main(args: Array[String]): Unit = {
    val method = new Test05_Method // 使用new创建一个类的实例对象
    method.method1() // 调用方法
  }
}
