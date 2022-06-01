package io.github.itlab1024.scala.chapter06

// 饿汉式
//object Test10_Singleton {
//  private val test10_Singleton: Test10_Singleton = new Test10_Singleton("itlab1024")
//
//  def getInstance(): Test10_Singleton = {
//    test10_Singleton
//  }
//
//  def main(args: Array[String]): Unit = {
//    println(Test10_Singleton.getInstance().eq(Test10_Singleton.getInstance())) // true 说明实例只有一个
//  }
//}
//主构造方法使用private修饰。
class Test10_Singleton private(val name: String) {

}

// 懒汉式
object Test10_Singleton {
  private var test10_Singleton: Test10_Singleton = _

  def getInstance(): Test10_Singleton = {
    if (test10_Singleton == null) {
      test10_Singleton =  new Test10_Singleton("itlab1024")
    }
    test10_Singleton
  }

  def main(args: Array[String]): Unit = {
    println(Test10_Singleton.getInstance().eq(Test10_Singleton.getInstance())) // true 说明实例只有一个
  }
}