package io.github.itlab1024.scala.chapter06

object Test11_Trait {
  def main(args: Array[String]): Unit = {
    val s = new S
    s.f2()
  }
}

// 定义一个父类
class P {
  def f2(): Unit = {
    println("p调用")
  }
}

// 定义两个trait
trait t1 {
  var name: String

  def f1(): Unit

  val age: Int = 10

  def f2(): Unit = {
    println("t1调用")
  }
}

trait t2 {
  var  name: String

  def f1(): Unit

  val age: Int = 10

  def f2(): Unit = {
    println("t2调用")
  }
}

// 子类,继承父类p，实现特质1和特质2,请注意下面的顺序
class S extends P with t1 with t2 {
  override var name: String = ""

  override def f1(): Unit = {}

  override val age: Int = 10

  override def f2(): Unit = super.f2() // f2方法在两个特质里都有， super.f2()调用的是谁呢？是特质t2
}
