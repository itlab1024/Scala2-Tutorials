package io.github.itlab1024.scala.chapter06

object Test08_AbstractClass {
  def main(args: Array[String]): Unit = {
    val clazz = new Class1
    clazz.name
  }
}

// 抽象类
abstract class Test08_AbstractClass {
  // 非抽象属性，抽象方法中的属性不用初始化，其他情况必须初始化
  var name: String = "itlab1024"
  // 抽象属性（只声明，没有初始化）
  val age: Int

  // 非抽象方法
  def f1(): Unit = {}

  // 抽象方法
  def f2(): Unit
}

/**
 * 普通类继承抽象类
 */
class Class1 extends Test08_AbstractClass {
  // age属性是抽象属性，所以普通类继承的时候必须初始化, override可以省略，但是我个人建议还是加上，代码清晰
  override val age: Int = 1

  // f2 是抽象方法，普通类继承的时候必须实现该方法, override可以省略，但是我个人建议还是加上，代码清晰
  override def f2(): Unit = {
    super.f1() //可以使用super调用父抽象类的方法
    println(age)
  }

  // 重写非抽象方法, override不能省略
  override def f1() {
  }

  // 重写非抽象属性, override不能省略, 此处虽然编译没有问题，但是运行时会提示错误"overriding variable name in class Test08_AbstractClass of type String;
  // variable name cannot override a mutable variable
  //  override var name: String = """
  // 也就是说变量不需要重写，直接使用name = "value"即可。可以将name修改为val下面的代码就不会有有问题
  //  override var name: String = ""

}
