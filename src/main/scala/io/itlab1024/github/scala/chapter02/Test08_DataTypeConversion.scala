package io.itlab1024.github.scala.chapter02

/**
 * 数据类型转换
 */
object Test08_DataTypeConversion {
  def main(args: Array[String]): Unit = {
    //    自动转换原则：多种类型混合运算时，系统会先自动将所有类型转换为精度大的类型，然后再做运算。
    val a: Byte = 10
    val b: Long = 23L
    //    val c: Int = a + b // 编译错误，提示结果是Long，不允许用Int类型常量接收
    val d: Int = a + b.toInt //这就没有问题，因为我将b通过toInt方法强制转换为Int，而a是Byte会自动提升为Int，计算结果是Int

    //    将精度大的赋值给精度小的数值类型时就会报错，反之自动转换
    val e: Int = 1
    val f: Long = e //自动转换为高精度类型
    //    val g: Byte = e // 错误

    //   (`Byte`和`Short`)和`Char`之间不会自动相互转换
    val h: Byte = 1
    //    val i: Char = h // 错误
    val j: Short = 1
    //    val k: Char = j //错误


    //   `Byte`，`Short`，`Char` 三者运算会先转换为`Int`类型
    //    val l: Short = h + j // 错误提示应该是Int

    //数值类型和String的互相转换（重点，平时开发中常用）
    // 数值转String
    val m: Int = 1
    val n: String = m + ""

    // String转换为数值
    val o: String = "1"
    val p: Int = o.toInt // 直接调用toInt方法

    // 注意异常问题
    //    val q : Int = "1.1".toInt //编译不报错，运行是不允许的。


    // 数据溢出问题
    val r: Int = 200 //200肯定超过了Bye的范围
    val s: Byte = r.toByte
    println(s)// 结果是-56 则是因为精度缺失了。
    /*我们分析下，Int是32位，
    200的原码是：
    00000000 00000000 00000000 11001000
    补码
    00000000 00000000 00000000 11001000

    那么转化为Byte的时候要截取1个自己8位，得到结果是11001000，那他的原码就是取反(00110111),再加一(10111000),结果就是-56
    */
  }
}
