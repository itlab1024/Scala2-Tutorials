package io.github.itlab1024.scala.chapter05

/**
 * 控制抽象
 */
object Test05_ControlAbstraction {
  def main(args: Array[String]): Unit = {
    // 通常函数调用我们都是传递值
    // 传值参数
    def f1(): Int = {
      println("f1调用")
      1
    }

    def f2(i: Int): Int = {
      i
    }

    println(f2(f1()))

    println("------")

    // 不同于上面的传值参数，接下来看下什么是传名参数
    // 请注意参数的类型 => Int
    def f3(i: => Int): Unit = {
      println(i)
      println(i)
    }
    f3(f1()) //这里需要注意的是f1调用了几次呢？两次，奇怪不，是因为上面f3对于i打印了2次，所有f1就被调用了两次
    // 运行结果是：
    /*
    ------
    f1调用
    1
    f1调用
    1
    */

  }
}
