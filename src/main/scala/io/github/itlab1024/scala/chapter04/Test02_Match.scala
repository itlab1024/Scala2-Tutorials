package io.github.itlab1024.scala.chapter04

object Test02_Match {
  def main(args: Array[String]): Unit = {
    //match基本用法
    val i = 0
    i match {
      case 0 => println("等于0")
      case _ => println("不等于0") // _代表默认分支
    }

    // match也有返回值
    val str = i match {
      case 0 => "ZERO"
      case _ => "NON ZERO"
    }
    println(str)

    // 同一个case语句有多个匹配值的时候，使用|分隔
    i match {
      case 0 | 1 => "0 or 1"
      case _ => "other"
    }

    // case中也可以使用表达式
    val o  = 1
    i match {
      case i if (i == 0) => "zero" //case后if表达式的括号scala是不推荐使用的。编辑器也提示给我们了
      case _ if o == 1 => "o is zero"
    }

    //case语句中判断数组是否包含匹配的数据
    i match {
      case a if 0 to 9 contains a  => println("包含")
    }
  }
}
