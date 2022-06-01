package io.github.itlab1024.scala.chapter06

object Test11_TypeCheckAndConversion {
  def main(args: Array[String]): Unit = {
    val ball = new Ball
    println("ball是Ball类型吗?" + ball.isInstanceOf[Ball]) // true
    println("ball是BasketBall类型吗?" + ball.isInstanceOf[BasketBall]) // false
    val ball2 = new BasketBall

    println("ball2是Ball类型吗?" + ball2.isInstanceOf[Ball]) // true
    println("ball2是BasketBall类型吗?" + ball2.isInstanceOf[BasketBall]) // true

    // 可以将父类型装置转化为子类型
    val ball3: BasketBall = new BasketBall
    println("ball3是Ball类型吗?" + ball3.isInstanceOf[Ball]) // true
    println("ball3是BasketBall类型吗?" + ball3.isInstanceOf[BasketBall]) // true
    //    转换
    val ball4: Ball = ball3.asInstanceOf[Ball]

  }
}

class Ball {

}

class BasketBall extends Ball {

}
