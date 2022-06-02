package io.github.itlab1024.scala.chapter07

import scala.collection.mutable.ListBuffer

object Test04_List {
  def main(args: Array[String]): Unit = {
    // 创建一个不可变的List,可以使用apply。
    val l: List[Int] = List.apply(1, 2, 3)
    // 也可以使用伴生对象创建
    val list: List[Int] = List(1, 2, 3)

    // 访问list的元素
    val i = list(1)
    println(i) // 2

    // 赋值
    //    list(0) = 10 // 这是不允许的

    // 遍历，可以使用普通for循环，或foreach
    for(i <- list.indices) {
      println(i)
    }

    // 添加元素
    // 向最后添加
    val list1 = list :+ 10
    println(list1) // List(1, 2, 3, 10)
    // 向前添加
    val list2 = 11 +: list1
    println(list2) // List(11, 1, 2, 3, 10)


    // 合并列表
    val l1 = List(1)
    val l2 = List(2)
    val l3 = l1 ::: l2 // 也可以使用l1 ++ l2
    println(l3) // List(1, 2)


    // 可变列表ListBuffer
    val lb: ListBuffer[Int] = ListBuffer[Int](1, 2, 3)
    lb.append(4)
    println(lb) // ListBuffer(1, 2, 3, 4)
    //其他的不操作了。。。。。。，跟ArrayBuffer类似

  }
}
