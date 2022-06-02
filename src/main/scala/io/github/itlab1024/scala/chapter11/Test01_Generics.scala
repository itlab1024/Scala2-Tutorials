package io.github.itlab1024.scala.chapter11

object Test01_Generics {
  // 协变和逆变
  val l: MyList[Father] = new MyList[Son] // 这是不允许的，但是如果将MyList的泛型修改为+E则没有问题。
  val n: MyList[Son] = new MyList[Father] // 这也是不允许的，，但是如果将MyList的泛型修改为-E则没有问题。
}

class Father {

}

class Son extends Father {

}

// 定义泛型的集合类型
class MyList[E] { // 此处现在是不变的泛型

}