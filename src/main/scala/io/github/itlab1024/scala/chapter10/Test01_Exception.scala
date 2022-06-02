package io.github.itlab1024.scala.chapter10

object Test01_Exception {
  def main(args: Array[String]): Unit = {
    try {

    } catch {
      case e: NullPointerException => println("空指针")
      case ex: ClassNotFoundException => println("类没没找到")
    } finally {
      // 别忘了关闭流等操作。。。。
    }
  }
}
