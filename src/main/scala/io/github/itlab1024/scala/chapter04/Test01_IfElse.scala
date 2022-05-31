package io.github.itlab1024.scala.chapter04

/**
 * if - else控制
 */
object Test01_IfElse {
  def main(args: Array[String]): Unit = {
    // if else
    val a: Int = 1
    if (a > 0) {
      println("正数")
    } else if (a == 0) {
      println("0")
    } else {
      println("负数")
    }

    // if else的返回值
    val b: Int = 10
    val c: Unit = if (b > 0) {
      println("测试返回值")
    }
    println(c) // ()

    // 多分支情况要保证最后返回的类型相同
    val d: String = if (b > 0) {
      println("测试返回值") // 此处返回是Unit，而else中返回是String，而接收者d的类型是String，这是不允许的（假设下行字符串代码没有）。
      "此处也返回String，保证每个分支返回的数据类型格式统一"
    } else {
      return "abc"
    }
  }
}
