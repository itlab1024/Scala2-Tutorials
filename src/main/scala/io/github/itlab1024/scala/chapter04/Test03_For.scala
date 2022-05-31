package io.github.itlab1024.scala.chapter04

import scala.util.control.Breaks

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
    val b: Int = 0
    for (i <- 0 to 10 if b > 1) {
      //永远不会执行，因为循环守卫 b > = 结果是false
    }

    println("-----------")
    // 循环步长
    for (i <- 1 to 10 by 2) {
      println(i) //1 3 5 7 9
    }
    // by 后也可以使用负数，当从大到小遍历的时候有用
    for (i <- 20 to 1 by -2) {
      println(i) //20,8,16,14,12,10,8,6,4,2
    }

    // 步长能使用小数吗？可以，要求to前后也必须是小数，也就是类型一致
    for (i <- 1.3 to 10.0 by 22.0) { //会提示to过期，使用BigDecimal
      println(i) //1 3 5 7 9
    }
    //使用BigDecimal
    for (i <- BigDecimal.decimal(1.3) to 10.0 by 22.0) { //会提示to过期，使用BigDecimal
      println(i) //1 3 5 7 9
    }

    // 和下面的for循环等价
    for (i <- 20 to 1 reverse) {
      println(i)
    }

    for (i <- 1 to 20) {
      println(i)
    }

    // 引入变量
    for (i <- 0 to 10; j = i + 1) {
      println(s"i=$i, j=$j")
    }

    //循环返回值
    val s1: Unit = for (i <- 1 to 10) {
      "结果"
    }
    println(s"s1 = $s1") //s1 = ()

    val s2 = for (i <- 1 to 10) yield {
      i * 2
    }
    println(s"s2 = $s2") // s2 = Vector(结果, 结果, 结果, 结果, 结果, 结果, 结果, 结果, 结果, 结果)

    // 将i都乘以2 ，最终返回一个数组
    val s3 = for (i <- 1 to 10) yield {
      i * 2
    }
    println(s3) //Vector(2, 4, 6, 8, 10, 12, 14, 16, 18, 20)

    // 循环中断
    // try catch
    try {
      for (i <- 0 to 10) {
        if (i == 1) {
          throw new RuntimeException
        }
      }
    } catch {
      case e: Exception => // 什么也不做，退出循环
    }
    // try catch 虽然可时间，但是有点麻烦， 可以用breaks下的break方法
    Breaks.breakable(for (i <- 0 to 10) {
      if (i == 1) {
        Breaks.break();
      }
    })

  }
}
