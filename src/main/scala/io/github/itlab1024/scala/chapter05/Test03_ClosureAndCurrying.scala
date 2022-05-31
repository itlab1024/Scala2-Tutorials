package io.github.itlab1024.scala.chapter05

/**
 * 闭包和柯里化
 */
object Test03_ClosureAndCurrying {
  def main(args: Array[String]): Unit = {
    // 闭包
    def add(i: Int): Int => Int = {
      def add2(j: Int): Int = {
        i + j
      }

      add2
    }

    val f1 = add(1) //f1是一个函数
    println(f1(2)) // 3


    // 函数柯里化
    def addCurrying(a: Int)(b: Int): Int = {
      a + b
    }
    println(addCurrying(1)(2))

  }
}
