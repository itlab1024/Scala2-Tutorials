package io.github.itlab1024.scala.chapter05

import scala.annotation.tailrec

/**
 * 递归
 */
object Test04_Recursion {
  def main(args: Array[String]): Unit = {
    println(fact(5))
  }

  def fact(n: Int): Int = {
    if (n == 0) return 1
    fact(n - 1) * n
  }

  // 递归有什么问题呢?会出现栈帧过多，出现Stack Overflow错误，在scala中如何解决呢？
  def fact2(n: Int) : Int = {
    @tailrec // 尾递归
    def work(n: Int, result: Int) : Int = {
      if (n == 0) return result
      work(n-1, result * n)
    }
    work(n , 1)
  }
  println(fact2(5)) // 结果也是120，但是这种方式就不会增多栈帧数量
}
