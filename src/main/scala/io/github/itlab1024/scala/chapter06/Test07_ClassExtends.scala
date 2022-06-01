package io.github.itlab1024.scala.chapter06

object Test07_ClassExtends {
  def main(args: Array[String]): Unit = {
    val clazz = new SubClass("itlab", 1, "男")
    //运行结果
    /*
    ParentClass 主构造器执行
    SubClass 主构造器执行
    SubClass 副构造器调用
     */
  }
}

class ParentClass {
  var name: String = "ITLAB"
  var age = 1
  println("ParentClass 主构造器执行")

  def this(name: String, age: Int) {
    this()
    println("ParentClass 副构造器调用")
    this.name = name
    this.age = age
  }

  def printName() = {
    println(this.name)
  }
}

class SubClass extends ParentClass {
  println("SubClass 主构造器执行")
  var sex: String = _

  def this(name: String, age: Int, sex: String) {
    this()
    println("SubClass 副构造器调用")
    this.name = name
    this.age = age
    this.sex = sex
  }

  //重写printName方法
  override def printName(): Unit = {
    println(this.name + " 子类")
  }
  // 多态，简单介绍下，没什么特别的 跟java一样
  def f1() {}
  def f1(i: Int){}
}
