package io.github.itlab1024.scala.chapter05

object Test06_LazyFunc {
  def main(args: Array[String]): Unit = {
    lazy val i = addOne(1)
    println(i) // 如果注释掉改行，也就是i不被使用，则addOne方法不会被执行
  }

  def addOne(i: Int): Int = {
    println("addOne方法被调用")
    i + 1
  }
}
