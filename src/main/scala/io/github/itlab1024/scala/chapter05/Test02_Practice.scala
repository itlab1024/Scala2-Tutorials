package io.github.itlab1024.scala.chapter05

object Test02_Practice {
  def main(args: Array[String]): Unit = {

    val arr: Array[Int] = Array(1, 2, 3)

    // 对数组进行处理，将操作抽象出来，处理完毕的结果返回一个新的数组
    def arrayOperation(array: Array[Int], op: Int => Int): Array[Int] = {
      for (a <- array) yield op(a)
    }

    // 定义一个+1操作
    def addOne(i: Int): Int = i + 1

    // 我们先对数组arr进行加一，返回新的数组
    val newArr = arrayOperation(arr, addOne)

    println(newArr.mkString(",")) // 2,3,4
  }
}
