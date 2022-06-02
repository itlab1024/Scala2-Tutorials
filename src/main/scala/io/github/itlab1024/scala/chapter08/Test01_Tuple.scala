package io.github.itlab1024.scala.chapter08

/**
 * 元组
 */
object Test01_Tuple {
  def main(args: Array[String]): Unit = {
    // 创建元组
    val tuple1: (Int, String, Boolean) = (1, "a", true)
    // 获取元组元素，通过_index的方式
    println(tuple1._1) // 1
    println(tuple1._2) // a
    println(tuple1._3) // true

    // 遍历元组
    for(e <- tuple1.productIterator) {
      println(e)
    }
  }
}
