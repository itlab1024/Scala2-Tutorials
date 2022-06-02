package io.github.itlab1024.scala.chapter07

import scala.collection.mutable

object Test06_MutableSet {

  def main(args: Array[String]): Unit = {
    // 创建可变set
    val set = mutable.Set(1, 2, 3)
    // 添加
    set += 10
    println(set) //Set(1, 2, 3, 10)
    // 建议使用add方法
    set.add(9)
    println(set) // Set(9, 1, 2, 3, 10)
  }
}
