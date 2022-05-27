package io.itlab1024.github.scala.chapter02

/**
 * 数据类型操作
 */
object Test07_DataType {
  def main(args: Array[String]): Unit = {
    // Boolean类型
    var b1: Boolean = false
    b1 = true


    // Byte
    var a: Byte = 127 //正确
    //    a = 128 // 编译出错
    //    a = -129 // 编译出错

    var b = 128 //128默认是Int

    // Long,可以不指定类型通过以L（l）结尾，建议使用大写。
    val c: Long = 122
    val c1 = 122L


    // 自动转化类型，下面的10和20默认是Int，相加=30，是在Byte范围内的，这是允许的。
    val d: Byte = 10 + 20 // IDEA提示类型不匹配（可能觉得后面应该是INT），但实际是可以运行的
    println(d) //30

    val e: Byte = 10
    //    val f: Byte = e + 20  // 编译器提示类型不匹配，这次匹配是确实不能执行的，这是因为这段代码只有到运行时才能获得b1的数据才能执行。
    // 可以使用强制类型转换
    val f: Byte = (e + 20).toByte // 使用toByte强制转化为Byte类型

    // 超过范围情况
    val g: Byte = 127 // 127是Byte的最大正数
    val h: Byte = 1
    //    val i: Byte = g + h// 运行会报错，因为127 + 1 = 128 超出了Byte范围，而是一个Int值。使用Byte接收是不允许的。

    // 浮点类型
    val j = 1.23 //默认是Double类型
    // 可以使用F(f)指定Float类型
    val j1 = 1.23F

    // 字符类型，标识单个字符,当然也包括控制字符（\t,\n等）
    val k: Char = 'a'
    val l: Char = '\t'
    val m: Char = '\\' // 如果想打印\需要使用转义

    // Char类型在计算机底层保存的是实际字面看到的字符吗？其实不是，真正保存的其实是ASCII码
    val n: Int = k
    println(n) // 97 ，也就是说字符'a'实际的整数值是97。

    // 整数转化为Char
    println(98.toChar) // b


    // Unit
    val o: Unit = ()
    // Null
    val p: Null = null
    // Nothing,比如下面方法可以返回Nothing，但是实际并不这么做，因为他是所有类型的子类
    def nothingTest() : Nothing = {
      throw RuntimeException // 必须抛出异常，否则提示返回类型应该是Void
    }
    //实际我们可能会这样做
    def nothingTest(i: Int) : Int = {
      if (i == 0)
        throw RuntimeException // 必须抛出异常，否则提示返回类型应该是Void
      else
        i
    }

  }
}
