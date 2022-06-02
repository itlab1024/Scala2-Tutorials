package io.github.itlab1024.scala.chapter07

object Test05_ImmutableSet {
  def main(args: Array[String]): Unit = {
    // 创建Set
    val s = Set(1, 2)
    // 添加元素
    val ns = s + 3
    println(ns) // Set(1, 2, 3)
  }
}
