package io.github.itlab1024.scala.chapter09

object Test01_PatternMatch {
  def main(args: Array[String]): Unit = {
    // match默认是无法对普通类进行操作的，必须在类的伴生对象中实现自己的apply和unapply方法。scala中提供了样例类，这样的类默认就提供了这些方法
    val t = T("itlab1024")
    t match {
      case T("1") => println("匹配1")
      case _ =>
    }
  }
}

// 样例类
case class T(name: String) {
}

