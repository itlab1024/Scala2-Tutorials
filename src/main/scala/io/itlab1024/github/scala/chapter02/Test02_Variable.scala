package io.itlab1024.github.scala.chapter02

import io.itlab1024.github.scala.chapter01.ScalaDrink

object Test02_Variable {
  def main(args: Array[String]): Unit = {
    // 定义变量
    var i: Int = 10
    // 定义常量
    val j: Int = 20

    // 类型确定后不能修改，scala其实是强类型语言
    //    i = "不能修改类型" // 编译错误

    //    j = 10; // 常量的值不能被修改

    // 变量声明的时候必须要有初始值
    // var a: Int // 这是编译不通过的,java中是允许的


    // 如果是引用类型，对象不能概念，但是对象里面的变量属性（通过var修饰）是可以修改的，常量属性（不使用var修饰或者使用val修饰）依然是不能修改的。
    val apple = new ScalaDrink("苹果")
    //    apple = new ScalaDrink("橘子") // 编译不通过
    //    apple.fruits = "橘子" // 编译不通过，因为之前创建的ScalaDrink类的fruits属性没有使用var修饰。
  }
}
