package io.github.itlab1024.scala.chapter07

/**
 * 多维数组
 */
object Test03_MultiArray {
  def main(args: Array[String]): Unit = {
    // 创建一个二维数组
    val array: Array[Array[Int]] = Array.ofDim[Int](2, 2)

    // 设置元素
    array(0)(1) = 1

    // 访问元素
    val i: Int = array(0)(1)
    println(i) // 1
    println("------")

    // 遍历二维数组
    for (i <- array.indices; j <- array(i).indices) {
      println(array(i)(j) + "\t")
      if (j == array(i).length - 1) println()
    }

    // 使用foreach循环
    array.foreach(_.foreach(println))
  }
}
