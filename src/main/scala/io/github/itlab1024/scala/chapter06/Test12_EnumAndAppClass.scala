package io.github.itlab1024.scala.chapter06

object Test12_EnumAndAppClass {
  def main(args: Array[String]): Unit = {
    println(TimeUnit.YEAR) //YEAR
    println(TimeUnit.DAY) // DAY
    println(TimeUnit.HOUR) // HOUR
    println(TimeUnit.YEAR.id) // 0
    println(TimeUnit.DAY.id) // 3
    println(TimeUnit.HOUR.id) // 4
    println(TimeUnit.MONTH.id) // 1

    // 通过名字获取到枚举
    val value = TimeUnit.withName("MONTH")
    println(value)
  }
}

object TimeUnit extends Enumeration {
  val YEAR: TimeUnit.Value = Value("YEAR")
  val MONTH: TimeUnit.Value = Value
  val DAY: TimeUnit.Value = Value(3, "DAY")
  val HOUR: TimeUnit.Value = Value
  val MINUTE: TimeUnit.Value = Value("MINUTE")
  val SECOND: TimeUnit.Value = Value
}
// 应用类
object MyApp extends App {
  println("继承APP就省去了main的定义")
}