package io.github.itlab1024.scala.chapter08

import scala.collection.mutable

/**
 * scala中的队列
 */
object Test02_Queue {
  def main(args: Array[String]): Unit = {
    // 定义队列
    val queue: mutable.Queue[Int] = mutable.Queue[Int]()
    println(queue) //Queue()

    // 入队
    queue.enqueue(1)
    println(queue) // Queue(1)

    // 出队
    val i = queue.dequeue()
    println(i) // 1
    println(queue) //Queue()
  }
}
