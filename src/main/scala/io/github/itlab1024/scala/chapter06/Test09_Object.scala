package io.github.itlab1024.scala.chapter06

import io.github.itlab1024.scala.chapter06.Test09_Object.SCALA_NAME

/**
 * 伴生对象，举个例子，一个类的所有示例对象可能都有一个共同值，在java中，我们在类中定义一个static的变量，然后对象中通过类型.属性名进行访问
 * 在scala中使用伴生对象来解决，比如下面的Test09_Object有两个，一个是class修饰，一个是object修饰。
 * object是伴生对象，伴随class修饰的类而生，两者名字要相同
 */
object Test09_Object {
  // 这就类似于java中的。 public staitc final String SCALA_NAME = "scala"
  val SCALA_NAME: String = "scala"
}

class Test09_Object {
  val name: String = SCALA_NAME
}
