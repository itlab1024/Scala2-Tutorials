package io.itlab1024.github.scala.chapter04

/**
 * for循环使用
 */
object Test03_For {
  def main(args: Array[String]): Unit = {
    // 普通范围循环,使用to关键字,包含左右边界值
    for (i <- 0 to 10) {
      println(i)
    }

    // 也可以使用until方法， 不包含后面的边界值
    for (i <- 0 until 10) {
      println(i)
    }

    // 循环守卫
    val b : Int = 0
    for (i <- 0 to 10 if b > 1) {
      //永远不会执行，因为循环守卫 b > = 结果是false
    }
  }
}
