package io.github.itlab1024.scala.chapter07

object Test07_ImmutableMap {
  def main(args: Array[String]): Unit = {
    // 创建Map
    val map: Map[Int, Int] = Map[Int, Int]((1, 2), (3, 4)) // 也可以使用->,比如1->2,3->4
    println(map) // Map(1 -> 2, 3 -> 4)

    // 添加
    val map1 = map + (5 -> 6)
    println(map1) // Map(1 -> 2, 3 -> 4, 5 -> 6)

    // 删除
    val map2 = map1 - 1
    println(map2) // Map(3 -> 4, 5 -> 6)

    // 通过key获取
    val i = map2(3)
    println(i) // 4, 如果key不存在会抛出异常

    // 循环
    for((k, v) <- map2) {
      println(s"k=$k, v=$v")
    }


  }
}
