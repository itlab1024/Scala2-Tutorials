package io.github.itlab1024.scala.chapter06

class Test06_Constructor {
  var name: String = ""
  var age: Int = 10
  println("主构造器被调用")

  // 副构造器，可以有多个
  def this(name: String) {
    this() //直接调用主构造器
    this.name = name
    println("副构造器被调用")
  }
}

object Test06_Constructor {
  def main(args: Array[String]): Unit = {
    new Test06_Constructor()

    println("--------")

    new Test06_Constructor("1")

    /*
    运行结果：


    主构造器被调用
    --------
    主构造器被调用
    副构造器被调用
    * */

    // 主构造器参数
    val cp = new ConstructorParams("itlab") // age有默认值，可以省略
    cp.age // 可以访问
    //    cp.name // 访问不到name
    // 调用printname方法
    cp.printName() // itlab

  }
}


// 参数可以使用val或者var，如果不修饰则通过 对象.属性名 无法获取到值，可以如下面的age那样指定默认值
class ConstructorParams(private var name: String, val age: Int = 1) {
  //    var name: String = "itlab" // 无需再次定义name，否则报错

  // 定义方法打印name
  def printName(): Unit = {
    println(this.name)
  }
}
