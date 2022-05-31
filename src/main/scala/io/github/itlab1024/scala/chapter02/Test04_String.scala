package io.github.itlab1024.scala.chapter02

object Test04_String {
  def main(args: Array[String]): Unit = {
    // 字符串连接
    val a = "I am learning "
    val b = "scala"
    println(a + b) // I am learning scala

    // printf格式化输出
    printf("%s%s\n", a, b) // I am learning scala

    // 插值字符串（模板字符串）
    println(s"$a$b") // I am learning scala， s是一个函数， 定义源码：def s(args: Any*): String = standardInterpolator(treatEscapes, args)

    // 也可以使用${}，通过+运算符进行连接
    println(s"${a + b}") // I am learning scala

    // ${}其实可以写scala代码，调用函数等等都是支持的
    println(s"${1 + 2 + math.pow(1, 2)}") // 4.0

    //格式化小数，比如小数位数,需要注意的是这就不能使用s函数，如果使用会原样输出，需要使用f函数。
    val f: Float = 11.2356F
    println(f"$f%2.2f") //11.24   这就是说小数点前面要保证两位，小数点后也是两位，多余位数四舍五入，舍弃
    // 也可以省略.前面的数字
    println(f"$f%.2f") //11.24
    // 前面的数字有范围吗?
    println(f"$f%100.2f") //输出空，为什么？我也不知道，有空看看源码吧，我估计还有很多细节，平时可能不会用到，但是面试或者考试估计就会出题，我们知道套路就是这样

    //raw函数的使用
    println(raw"$f%2.2f") // 11.2356%2.2f，除了$获取变量值外，其他的字符原样输出了
    println(s"$f%2.2f") // 11.2356%2.2f
    // s函数和raw函数结果一样，那么他俩有啥区别呢
    println(raw"$f%2.2f\t回车") // 11.2356%2.2f\t回车， 真正的原样输出
    println(s"$f%2.2f\t回车") // 11.2356%2.2f	回车， \t未原样输出，被解析制表符


    // 三引号
    val s1: String =
      """
        |i
        |am
        |learning
        |scala
        |""".stripMargin
    println(s1) // 原样输出，注意不会输出|,会有回车换行

    // 三引号字符串同样可以使用s,raw等函数
    val s2 =
      s"""
         |The
         |value
         |is
         |$a
         |""".stripMargin
     println(s2)

    // raw
    val s3 =
      raw"""
           |$a \txx
           |""".stripMargin
   println(s3)


  }
}
