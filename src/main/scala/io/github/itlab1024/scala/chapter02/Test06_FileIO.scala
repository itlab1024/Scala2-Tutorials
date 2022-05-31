package io.github.itlab1024.scala.chapter02

import java.io.PrintWriter
import scala.io.Source

/**
 * 文件的输入输出
 *
 * @author itlab1024
 */
object Test06_FileIO {
  def main(args: Array[String]): Unit = {
    // 从文件中读取数据，使用scala.io包下的相关包
    // 读取文件主要分为三个步骤,1：打开文件流，2：读取文件，3：关闭文件流
    val bufferedSource = Source.fromFile("src/main/resources/read.text")
    bufferedSource.foreach(print)
    bufferedSource.close()

    // 写内容到文件,scala中没有实现写文件的api，我们需要通过调用Java的api来实现
    val writer = new PrintWriter("src/main/resources/write.txt")
    writer.write("I am learning scala")
    writer.close()
  }
}
