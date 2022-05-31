package io.github.itlab1024.scala.chapter02

/**
 * 标识符规范测试
 */
object Test03_Identifier {
  def main(args: Array[String]): Unit = {
    //    （1）标识符由字母、数字、下划线组成，但是首字母必须是字母或者下划线
    val scala: String = "scala"
    val scala134: Int = 1
    val _scala: String = "scala"
    //    val 1scala: Int = 1 //编译不通过，不能以为数字开头
    //    val a+b = 1 // IDEA工具并不提示错误，但是实际上是不允许的，会提示not found: value +


    // (2)以操作符开头，且只能包含操作符（#-*/#!等）
    // 搞不懂谁会这么干，有实际应用场景吗？？？
    val +-*/ = 10 //正确
    val +#%^&^*&&* = 10 //正确
    println(+#%^&^*&&*)

    // (3) 用反引号``将任意字符串包起来，这是合法的标识符，即便是scala中的关键字也是可以的，
    // 上面有个定义a+b是允许的，但是如果使用反引号引起来就是允许的
    val `a+b` = 1
    println(`a+b`)
    // 关键字也是允许的
    //    val if = 1 //编译不通过
    val `if` = 1
    println(`if`) //正确

  }
}
