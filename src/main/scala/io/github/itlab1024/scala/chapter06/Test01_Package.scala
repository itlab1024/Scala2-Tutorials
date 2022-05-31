// 嵌套风格的package
package p1 {
  // 定义一个单例对象
  object o1 {
    val N1: String = "N1"
  }
  package p2 {
    object o2 {
      def main(args: Array[String]): Unit = {
        o1.N1 // 直接调用外层包
      }
    }
  }
}