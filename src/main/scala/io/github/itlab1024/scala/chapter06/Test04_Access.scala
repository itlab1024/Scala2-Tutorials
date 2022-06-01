package io.github.itlab1024.scala.chapter06

// 定义一个子类
class Test04_Access extends Test04_ClassForAccess {
  override def printInfo(): Unit = {
    //    println(idcard) // 无法访问，idcard是private 只能在本类和其伴生对象中访问
    println(name) //可以访问，protected，可以再父子类访问
    println(sex) //可以访问，默认public的

    println(age) // age可以访问，因为使用了private [chapter06]声明了
  }
}
