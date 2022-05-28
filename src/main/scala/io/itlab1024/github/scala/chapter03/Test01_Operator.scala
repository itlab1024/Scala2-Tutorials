package io.itlab1024.github.scala.chapter03

/**
 * 运算符操作
 */
object Test01_Operator {
  def main(args: Array[String]): Unit = {
    // 算术运算符
    val a = 10 / 3 //结果是3
    // 如果获得小数呢,可以将10 改为10.0（或者10D,或者10.toDouble）（系统默认为Double类型）
    val b = 10D / 3
    println(b) // 3.3333333333333335

    // 关系运算符
    val s1 : String = "a"
    val s2 : String = new String("a")
    println("值是否相等：" + (s1 == s2)) // true
    println("值是否相等：" + s1.equals(s2)) // true
    println("引用是否相等:" + s1.eq(s2)) //false

    // 运算符和java的基本是一样的，这里我就一一使用了。懒了


  }
}
