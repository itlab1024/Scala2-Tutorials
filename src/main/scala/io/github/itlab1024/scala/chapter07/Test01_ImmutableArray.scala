package io.github.itlab1024.scala.chapter07

object Test01_ImmutableArray {
  def main(args: Array[String]): Unit = {
    var arr: Array[Int] = new Array[Int](10)
    // 另一种创建的方式,使用apply方法
    val array = Array.apply(1, 2, 3) // 可省略apply方法， Array(1, 2, 3)
    println(array.length)
    // 访问数组中的元素
    val i = array(0)
    println("第一个元素是:" + i) // 1
    // 修改,不是说不可变吗，要注意的是不可变数组的不可变是说内存地址不变，大小不可变，索引上的元素还是可以变的
    array(0) = 4
    println(array.mkString(",")) // 4,2,3
    println("------------")
    // 循环数组
    // 普通for loop
    for(i <- 0 until array.length) {
      println(i)
    }
    println("------------")
    // 上面代码提示我们可以使用array.indices
    for (i <- array.indices) {
      println(i)
    }
    println("------------")
    // 我们也可以使用如下方法
    for (i <- array) {
      println(i)
    }
    println("------------")
    // 也可以使用foreach方法，函数式编程
    array.foreach(println)

    println("------------")
    // 迭代器
    val iterator = array.iterator
    while (iterator.hasNext) {
      println(iterator.next())
    }
    println("------------")

    // 添加元素(追加到最后，使用:+()方法)
    val newArray = array.:+(0) // 返回新的数组
    newArray.foreach(println)
    println("------------")

    // 向最前面添加元素(使用+:()方法)
    val newArray2 = newArray.+:(-1)
    newArray2.foreach(println)

    // 简化使用+:和:+
    val ints = newArray2 :+ 1
    val ints2 = 29 +: newArray2

    

  }
}
