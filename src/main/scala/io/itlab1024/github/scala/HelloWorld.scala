package io.itlab1024.github.scala

/**
 * object：scala中的一个关键字，声明一个单例对象，也叫做伴生对象
 */
object HelloWorld {
  /**
   * 程序的入口方法， def是关键字，用于定义方法，括号内是参数信息，args是参数名，通过：类型定义数据类型，
   * 此main方法中args参数的类型是是字符串数组，其实这跟java的类似，只不过表现形式不同而已。括号后面的:Unit代表返回类型，Unit在scala中代表空，类似于Java中的Void
   * @param args
   */
  def main(args: Array[String]): Unit = {
    println("Hello World")
  }
}
