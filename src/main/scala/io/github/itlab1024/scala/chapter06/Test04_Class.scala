package io.github.itlab1024.scala.chapter06

import scala.beans.BeanProperty

object Test04_Class {
  def main(args: Array[String]): Unit = {
    val it = new IT
    it.name //可以访问
    //    it.age // 因为是private，不能访问
    // 赋值
    //    it.name = "itlab1024" // val常量不能变更值
    it.weibo = "itlab" // 可以
    // homeUrl 我们加了 @BeanProperty注解，就可以使用get和set方法
    it.setHomeUrl("")
    it.getHomeUrl
  }
}

// 定义一个类
class IT {
  // 定义属性和方法
  val name: String = "itlab"
  // 可以定义为私有的

  private var age: Int = 1
  @BeanProperty // @BeanProperty 提供getter方法和setter方法
  var homeUrl = "itlab1024.github.io"

  var weibo: String = _

}