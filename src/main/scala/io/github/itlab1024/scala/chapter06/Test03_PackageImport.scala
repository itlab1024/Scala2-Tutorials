package io.github.itlab1024.scala.chapter06

/**
 * 包导入
 */
// 给类起别名
import java.util.{ArrayList => MyArrays}
// 不导入HashMap，这有啥用？？?
import java.util.{HashMap => _}

object Test03_PackageImport {
  def main(args: Array[String]): Unit = {
    // 使用别名
    val i: MyArrays[Int] = new MyArrays[Int]()

  }
}

// 嵌套包导入
package A {
  package B {

  }

}
