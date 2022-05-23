package io.itlab1024.github.scala.chapter01

/**
 * Scala中Drink类
 */
class ScalaDrink (fruits: String){
  def show (): Unit = {
    println("MAJOR=" + ScalaDrink.MAJOR + ", Fruits=" + this.fruits)
  }
}

// 伴生对象
object ScalaDrink {
  var MAJOR: String = "水"
}
