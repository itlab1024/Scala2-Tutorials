package io.github.itlab1024.scala.chapter05

object Test01_Func {
  def main(args: Array[String]): Unit = {
    // 函数，求两个整数的和
    def sum(x: Int, y: Int): Int = {
      x + y
    }

    // 多返回值
    def sumAndDes(x: Int, y: Int): (Int, Int) = { // 多个返回值用括号包裹起来
      return (x + y, x - y) // return可以省略
    }

    // 可变参数
    def printlnValues(values: String*) = {
    }

    //参数默认值
    def defaultParmasFunc(x: Int = 10) = {}

    // 带名参数
    def namedParamFunc(name: String, age: Int): Unit = {

    }

    namedParamFunc(name = "张三", age = 10) // 调用的时候可以指定名称


    // 函数至简原则
    //    * return可以省略，scala使用函数体最后一个代码作为返回值
    def func1(x: Int): Int = {
      x + 1
    }

    //    * 如果函数体只有一个行代码，大括号可以省略
    def func2(x: Int): Int = x + 1

    //    * 返回值类型如果能够推断出来，那么可以省略
    def func3(x: Int) = x + 1

    //    * 如果有return，则不能省略返回值类型，必须指定, 比如下面方法的: Int不能省略
    def func4(x: Int): Int = return x + 1

    //    * 如果函数明确声明Unit，那么即便函数体中使用return也不会起作用,
    def fun5(x: Int): Unit = return x + 1

    println(fun5(1)) // 结果不是2，而是(),也就是Unit

    //    * scala如果无返回值类型，可以省略等号
    def func6(x: Int) {}

    //    * 如果函数无参，但是声明了参数列表，那么调用时小括号可以省略
    def func7() = {}

    func7 // 等价于func7()

    //    * 如果函数没有参数列表，那么小括号可以省略，调用时小括号必须省略
    def fun8 = {}

    fun8 // 不能使用fun8()

    //    如果不关心名称只关心处理逻辑，那么def关键字可以省略，这就是匿名函数
    val func9 = (name: String) => {
      // 函数体
      println(name)
    }
    //      如何调用呢,scala中什么都有返回值
    //      上面的例子可以修改为
    func9("名字")

    // ----函数的值传递------
    // 先定义一个函数
    def func10(i: Int): Int = {
      println("函数func10被调用")
      i + 1
    }

    // 函数作为值进行传递, 函数名后加上空格再加上_代表这是一个函数整体
    val f1 = func10 _ // 也可以写成val f1 : Int => Int = func10， 也可以写成
    println(f1)
    println(f1(10))

    // 函数可以作为函数参数传递
    // 定义一个二元计算,下面的dualEval是一个函数，参数是op也是一个函数，此函数的参数列表是Int类型的a和b
    def dualEval(op: (Int, Int) => Int, a: Int, b: Int): Int = {
      op(a, b)
    }

    def op(a: Int, b: Int): Int = {
      a + b
    }

    println(op(1, 2))

    // 函数可以作为函数的返回值
    def returnFunc(): String => String = {
      def subFunc1(s: String) = {
        println(s)
        "晕"
      }

      subFunc1
    }

    val stringToString: String => String = returnFunc()
    val str = stringToString("参数")
    println(str)
  }
}
