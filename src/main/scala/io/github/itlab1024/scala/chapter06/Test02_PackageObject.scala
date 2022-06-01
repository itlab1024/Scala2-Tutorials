package io.github.itlab1024.scala.chapter06

object Test02_PackageObject {
  def main(args: Array[String]): Unit = {
    // 调用包对象的方法和成员
    println(sharedValue1)
    println(pkgName())
  }
}
