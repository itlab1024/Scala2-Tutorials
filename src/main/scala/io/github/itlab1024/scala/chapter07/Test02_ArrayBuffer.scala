package io.github.itlab1024.scala.chapter07

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

/**
 * 可变数组ArrayBuffer
 */
object Test02_ArrayBuffer {
  def main(args: Array[String]): Unit = {
    // 创建可变数组
    val _ = new ArrayBuffer[Int]()
    // 第二种方法使用伴生对象
    val array = ArrayBuffer(1, 2, 3)
    println(array) // ArrayBuffer(1, 2, 3)
    println("---------")

    // 访问数组的元素
    val i = array(0)
    println(i)
    println("---------")

    // 修改
    array(0) = -1
    println(array)
    println("---------")

    // 添加元素 可以使用:+和+:的方式，但是需要注意的是需要定义新的数组来接收。
    val ints = array :+ 2 // 向后追加
    println(ints)
    println("---------")
    // 向前追加
    val ints1 = 1 +: array
    println(ints1)

    println("---------")

    // 向后追加推荐使用+=来实现
    println(array) // ArrayBuffer(-1, 2, 3)
    println("---------")

    // 向前追加使用+=:
    1 +=: array
    println(array) // ArrayBuffer(1, -1, 2, 3)
    println("---------")

    // 也可使用append方法和prepend方法
    array.append(1)
    println(array) // ArrayBuffer(1, -1, 2, 3, 1)
    println("---------")
    array.prepend(0)
    println(array) // ArrayBuffer(0, 1, -1, 2, 3, 1)
    println("---------")

    // 插入值
    array.insert(1, 100) //在索引1的位置插入100，后面的值后移
    println(array) // ArrayBuffer(0, 100, 1, -1, 2, 3, 1)
    println("---------")

    // 删除元素
    array.remove(1)
    println(array) //ArrayBuffer(0, 1, -1, 2, 3, 1)
    println("---------")
    // 也可以删除索引后的几个值
    array.remove(1, 2)
    println(array) // ArrayBuffer(0, 2, 3, 1)
    println("---------")

    //也可以根据值来删除
    array -= 1
    println(array) // ArrayBuffer(0, 2, 3)
    println("---------")

    // 如果有多个相同的值呢，使用-=只会删除一个，并且从左向右寻找。
    array.append(1, 2, 1)
    println(array) // ArrayBuffer(0, 2, 3, 1, 2, 1)
    array -= 1
    println(array) //ArrayBuffer(0, 2, 3, 2, 1)

    // 可变数组与不可变数组的转换
    var a1 = ArrayBuffer[Int](1, 2, 3)
    // 转换为不可变数组
    val array1: Array[Int] = a1.toArray
    // 将不可变数组转化为可变数组
    val buffer: mutable.Buffer[Int] = array1.toBuffer
  }
}
