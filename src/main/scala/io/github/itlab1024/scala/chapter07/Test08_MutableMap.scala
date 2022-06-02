package io.github.itlab1024.scala.chapter07

import scala.collection.mutable

object Test08_MutableMap {
  def main(args: Array[String]): Unit = {
    // 定义可变的map
    val map: mutable.Map[Int, Int] = mutable.Map(1 -> 2, 3 -> 4)
    // 添加
    map + (5 -> 6)
    println(map) // Map(1 -> 2, 3 -> 4) 为啥没加进去，其实+这个函数就是为了不可变设计的。但是scala缺无法根据不同的map区分，其实list和set也是如此

    // 使用
    map.put(5, 6)
    println(map) // Map(5 -> 6, 1 -> 2, 3 -> 4)

    // 懒了，其他的不试了，以后用的时候再积累吧
  }
}
