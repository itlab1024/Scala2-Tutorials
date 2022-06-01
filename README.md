# 什么是Scala？

[Scala ](https://scala-lang.org/)是一门基于JVM和Java完全兼容的语言，具有跨平台，可移植性，完备的垃圾回收机制等特定

Scala比Java更加面向对象，他是一门纯面向对象的语言，我们知道Java并不是，比如他具有基本类型。

Scala是一门函数式编程语言，Java并不是，JDK8增加的Lambda是函数式。

Scala的非常适合大数据处理，我们熟悉的Spark、Flink、Kafka等底层都是使用Scala实现的。



Scala目前主流版本是2，目前版本3也已经Released。先学习2，再学习3。

![Scala官网](https://raw.githubusercontent.com/ITLab1024/picgo-images/main/202205231147213.png)



# 为什么学习Scala？

Scala的好处上面已经提到过了，这些是我们学习Scala的理由，单不完全是我的理由。

我的理由主要是：

```tex
公司业务是物联网（IOT），工作需要大数据相关技术，所以学习。

个人也比较喜欢新技术，除了Scala，我也学习目前流行的Golang语言。
```

建议：学习新技术要根据自己实际情况而定，首先要工作需要的技术，这能够提高技术同时是的自己在岗位上更加突出，更加胜任工作，其次学习时间比较多。

# 学习资料

我目前学习Scala的主要渠道主要有两处，官网和尚硅谷视频。

官网是必须要看的，并且强烈推荐看英文原版内容，有些中文网翻译水平实在有限，并且有错误。

我虽然主要看官网，但是官网资料比较松散，自己又不太爱总结，也觉得浪费时间，我是初学一门语言，在学习Scala的路上，我就是个菜鸟。尚硅谷的视频还是非常不错的（不是打广告哈哈）。

我学习的过程中主要是跟着尚硅谷的视频学习，但是不完全操作其内容，主要是根据他的目录来学习。



另外这里建议下，没学过Java的不要学习scala！！！



# Scala入门

## Scala、Java、JVM的关系

![Scala、Java和JVM关系](https://raw.githubusercontent.com/ITLab1024/picgo-images/main/202205231300992.jpeg)

Java和JVM的关系：写代码(.java) => 使用`javac`命令编译为`.class`文件 => 使用JVM运行

Scala和JVM的关系：写代码(.scala) =>使用`scalac`命令编译为`.class`文件 => 使用JVM运行

两者极其类似！！！

Scala能够使用Java类库！！！



## Scala环境安装

前提：scala基于JVM，要求我们环境要安装JDK。JDK的安装请自行查询，检查JDK是否安装

```shell
➜  ~ java -version
openjdk version "17.0.3" 2022-04-19 LTS
OpenJDK Runtime Environment Corretto-17.0.3.6.1 (build 17.0.3+6-LTS)
OpenJDK 64-Bit Server VM Corretto-17.0.3.6.1 (build 17.0.3+6-LTS, mixed mode, sharing)
```

我电脑安装的是OpenJDK17，只要大于8即可。

Scala支持Mac、Windows、Linux等系统。有多种安装方式，

![image-20220523130559667](https://raw.githubusercontent.com/ITLab1024/picgo-images/main/202205231305748.png)

官方推荐使用`cs setup`安装

```shell
➜  ~ brew install coursier/formulas/coursier && cs setup
Updating Homebrew...
==> Downloading https://github.com/coursier/coursier/releases/download/v2.1.0-M5
Already downloaded: /Users/shizhenchao/Library/Caches/Homebrew/downloads/a34af3e5d8010f4b87297cbcf23a7090d907d343dfbb691e9ddea9facb4b1605--coursier
==> Downloading https://github.com/coursier/coursier/releases/download/v2.1.0-M5
Already downloaded: /Users/shizhenchao/Library/Caches/Homebrew/downloads/e56f4bc31b6326034ab85448faa48e50054affc7b327e3e82180fc861633fc54--cs-x86_64-apple-darwin.gz
==> Installing coursier from coursier/formulas
^C^C
One sec, cleaning up...

➜  ~ 
➜  ~ brew install coursier/formulas/coursier && cs setup
Updating Homebrew...
==> Downloading https://github.com/coursier/coursier/releases/download/v2.1.0-M5
Already downloaded: /Users/shizhenchao/Library/Caches/Homebrew/downloads/a34af3e5d8010f4b87297cbcf23a7090d907d343dfbb691e9ddea9facb4b1605--coursier
==> Downloading https://github.com/coursier/coursier/releases/download/v2.1.0-M5
Already downloaded: /Users/shizhenchao/Library/Caches/Homebrew/downloads/e56f4bc31b6326034ab85448faa48e50054affc7b327e3e82180fc861633fc54--cs-x86_64-apple-darwin.gz
==> Installing coursier from coursier/formulas
==> Caveats
zsh completions have been installed to:
  /usr/local/share/zsh/site-functions
==> Summary
🍺  /usr/local/Cellar/coursier/2.1.0-M5-18-gfebf9838c: 5 files, 57.4MB, built in 49 seconds
Checking if a JVM is installed
Found a JVM installed under /Users/shizhenchao/Library/Java/JavaVirtualMachines/corretto-17.0.3/Contents/Home.

Checking if ~/Library/Application Support/Coursier/bin is in PATH

Checking if the standard Scala applications are installed
  Installed ammonite
  Installed cs
  Installed coursier
  Installed scala
  Installed scalac
  Installed sbt
  Installed sbtn
  Installed scalafmt
```

默认安装的scala是最新版本（3.1.2）

因为我主要是跟着尚硅谷视频学习，所以同步使用他的版本（2.12.11）

安装参考如下地址：https://scala-lang.org/download/2.12.11.html

通过命令行用`cs`工具安装

```shell
➜  ~ cs install scala:2.12.11 && cs install scalac:2.12.11
https://repo1.maven.org/maven2/io/get-coursier/apps/maven-metadata.xml
  No new update since 2022-05-16 17:11:57
https://repo1.maven.org/maven2/org/scala-lang/scala-compiler/2.12.11/scala-comp…
  100.0% [##########] 2.6 KiB (10.9 KiB / s)
https://repo1.maven.org/maven2/org/scala-lang/scala-reflect/2.12.11/scala-refle…
  100.0% [##########] 1.8 KiB (8.0 KiB / s)
https://repo1.maven.org/maven2/org/scala-lang/scala-compiler/2.12.11/scala-comp…
  100.0% [##########] 10.2 MiB (4.0 MiB / s)
https://repo1.maven.org/maven2/org/scala-lang/scala-reflect/2.12.11/scala-refle…
  100.0% [##########] 3.5 MiB (1.1 MiB / s)
Wrote scala
Wrote scalac

➜  ~ scala -version
Scala code runner version 2.12.11 -- Copyright 2002-2020, LAMP/EPFL and Lightbend, Inc.
```

温馨提示：如果使用二进制安装，需要配置环境变量。

交互式命令行，输入`scala`命令接口打开：

```scala
➜  ~ scala
Welcome to Scala 2.12.11 (OpenJDK 64-Bit Server VM, Java 17.0.3).
Type in expressions for evaluation. Or try :help.

scala> val a:Int = 10
a: Int = 10

scala> val b:Int =5
b: Int = 5

scala> a + b
res0: Int = 15

scala> 
```



写代码并编译执行，创建一个Hello.scala文件，文件内容如下

```scala
object Hello {
	def main(ags: Array[String]): Unit = {
		println("hello")
	}
}
```

使用`scalac`编译文件，使用`scala`指令运行

```shell
➜  Scala2-Tutorials git:(main) ✗ scalac Hello.scala 
➜  Scala2-Tutorials git:(main) ✗ scala Hello         
hello
```



## 编程工具

官方推荐使用`VSCode`和`IDEA`，我个人非常喜欢使用`IDEA`，接下来我也会在IDEA上进行开发。

## 安装插件

使用`IDEA`开发scala需要安装插件。

![IDEA安装Scala插件](https://raw.githubusercontent.com/ITLab1024/picgo-images/main/202205231446809.png)

## 创建项目

![IDEA创建Scala项目](https://raw.githubusercontent.com/ITLab1024/picgo-images/main/202205231515233.png)



![等待中](https://raw.githubusercontent.com/ITLab1024/picgo-images/main/202205231546413.png)



![创建完成](https://raw.githubusercontent.com/ITLab1024/picgo-images/main/202205231528324.png)

Scala支持使用`SBT`和`IntelliJ`创建项目，我用的是`sbt`。其他的方式我就不演示了。

## HelloWorld

创建package

在上图中`scala`文件夹上邮件，选择创建package

![创建package](https://raw.githubusercontent.com/ITLab1024/picgo-images/main/202205231531551.png)

创建一个Object，scala中的`Object`是一个单例类，全局只有一份

![新建Scala Class，选中Object](https://raw.githubusercontent.com/ITLab1024/picgo-images/main/202205231533007.png)

编写入口程序main方法的代码

![Hello World main代码](https://raw.githubusercontent.com/ITLab1024/picgo-images/main/202205231535529.png)



解析下上面的main方法

```scala
package io.itlab1024.github.scala

/**
 * object：scala中的一个关键字，声明一个单例对象，也叫做伴生对象
 */
object HelloWorld {
  /**
   * 程序的入口方法， def是关键字，用于定义方法，括号内是参数信息，args是参数名，通过：类型定义数据类型，
   * 此main方法中args参数的类型是是字符串数组，其实这跟java的类似，只不过表现形式不同而已。括号后面的:Unit代表返回类型，Unit在scala中代表空，类似于Java中的Void
   * @param args
   */
  def main(args: Array[String]): Unit = {
    println("Hello World")
  }
}
```

## 伴生对象

`object`关键字是用于创建伴生对象，什么是伴生对象呢？伴随谁而生？想想我们再Java中使用`static`定义一个对象，如何访问呢？我们需要使用类名.属性来访问。看下下面的代码

```java
package io.itlab1024.github.scala;

/**
 * 饮料类
 */
public class Drink {
    private static final String MAJOR = "水";
    /**
     * 水果成分
     */
    private String fruits;

    public String getFruits() {
        return fruits;
    }

    public void setFruits(String fruits) {
        this.fruits = fruits;
    }
    
    public void show() {
        System.out.println("MAJOR=" + Drink.MAJOR + ", Fruits=" + this.fruits);
    }
}
```

上面代码是java中的定义，`Drink`代表饮料类，有两个成员变量类，`MAJOR`代表主成分（饮料主成分都是水），使用`static`定义，还有一个`fruits`代表水果，我们看下第22行中`Drink.MAJOR`使用的是类名字.属性访问，这在java中是正确的，但是这并不符合面向对象的设计，因为我并没有通过对象获取属性，scala中伴生对象就是创造一个伴生类的对象（伴生对象）。这更符合面向对象的思想。

上面的例子我通过scala的class和object实现(用新的名字ScalaDrink，否则类冲突，当然也可以修改内容中的class后的名字，而不是修改文件名。)

```scala
package io.itlab1024.github.scala.chapter01
import io.github.itlab1024.scala.chapter01.ScalaDrink

/**
 * Scala中Drink类
 */
class ScalaDrink (fruits: String){
  def show (): Unit = {
    println("MAJOR=" + ScalaDrink.MAJOR + ", Fruits=" + this.fruits)
  }
}

// 伴生对象
object ScalaDrink {
  var MAJOR: String = "水"
}
```

IDEA工具很有好的为我们编辑了类和伴生对象的关系。

![伴生对象关系](https://raw.githubusercontent.com/ITLab1024/picgo-images/main/202205231617342.png)



个人体会：scala为了满足纯面向对象的设计，搞得复杂了，语言我觉得越简单越好。



# 变量和数据类型

## 注释

Scala中的注释跟Java中的完全一样，分为单行注释、多行注释和文档注释

```scala
package io.itlab1024.github.scala.chapter02

/**
 * 文档注释
 */
object Test01_Comment {
  /*
  多行注释
  main方法的定义
  */
  def main(args: Array[String]): Unit = {
    // 单行注释
    println("hello")
  }
}
```

## 常量和变量

常量使用`val` 声明，变量说过`var`声明

var 常量名[: 类型] = 初始值

val 变量名[: 类型] = 初始值

注意：能用常量的地方不用变量

```scala
package io.itlab1024.github.scala.chapter02

import io.github.itlab1024.scala.chapter01.ScalaDrink

object Test02_Variable {
  def main(args: Array[String]): Unit = {
    // 定义变量
    var i: Int = 10
    // 定义常量
    val j: Int = 20

    // 类型确定后不能修改，scala其实是强类型语言
    //    i = "不能修改类型" // 编译错误

    //    j = 10; // 常量的值不能被修改

    // 变量声明的时候必须要有初始值
    // var a: Int // 这是编译不通过的,java中是允许的


    // 如果是引用类型，对象不能概念，但是对象里面的变量属性（通过var修饰）是可以修改的，常量属性（不使用var修饰或者使用val修饰）依然是不能修改的。
    val apple = new ScalaDrink("苹果")
    //    apple = new ScalaDrink("橘子") // 编译不通过
    //    apple.fruits = "橘子" // 编译不通过，因为之前创建的ScalaDrink类的fruits属性没有使用var修饰。
  }
}
```

除了修饰符不同以外，跟java类似。

## 标识符命名规范

什么是标识符？scala中对变量、常量、方法、函数名字统称为标识符

scala中的标识符命名规则基本与java一致。

1. 标识符由字母、数字、下划线组成，但是首字母必须是字母或者下划线

2. 以操作符开头，且只能包含操作符（#-*/#!等）

3. 用反引号``将任意字符串包起来，这是合法的标识符，即便是scala中的关键字也是可以的，

   scala中的关键字主要有

   * `package`，`import`，`class`，**`object`**，**`trait`**，`extends`，**`with`**，`type`，

   `for`

   * `private`，`protected`，`abstract`，**`scaled`**，`final`，**`implicit`**，`lazy`，`override`
   * `if`，`else`，**`match`**，`case`，`do`，`while`，`for`，`return`，**`yield`**
   * **`def`，`var`，`val`**
   * `this`，`super`
   * `new`
   * `true`, `false`, `null`

**示例**

```scala
package io.itlab1024.github.scala.chapter02

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
```



## 字符串输出

字符串可以通过`+`操作符进行相加，例如`"a" + "b" `结果是`ab`

`printf`格式化输出，通过`%`来显示不同内容，类似java中的`System.out.printf`以及Go中的`fmt.Printf`。

插值字符串，在字符串总通过`$`获取变量进行拼接

示例

```scala
package io.itlab1024.github.scala.chapter02

object Test04_String {
  def main(args: Array[String]): Unit = {
    // 字符串连接
    val a = "I am learning "
    val b = "scala"
    println(a + b) // I am learning scala

    // printf格式化输出
    printf("%s%s\n", a, b) // I am learning scala

    // 插值字符串（模板字符串）
    println(s"$a$b") // I am learning scala， s是一个函数， 定义源码：def s(args: Any*): String = standardInterpolator(treatEscapes, args)

    // 也可以使用${}，通过+运算符进行连接
    println(s"${a + b}") // I am learning scala

    // ${}其实可以写scala代码，调用函数等等都是支持的
    println(s"${1 + 2 + math.pow(1, 2)}") // 4.0

    //格式化小数，比如小数位数,需要注意的是这就不能使用s函数，如果使用会原样输出，需要使用f函数。
    val f: Float = 11.2356F
    println(f"$f%2.2f") //11.24   这就是说小数点前面要保证两位，小数点后也是两位，多余位数四舍五入，舍弃
    // 也可以省略.前面的数字
    println(f"$f%.2f") //11.24
    // 前面的数字有范围吗?
    println(f"$f%100.2f") //输出空，为什么？我也不知道，有空看看源码吧，我估计还有很多细节，平时可能不会用到，但是面试或者考试估计就会出题，我们知道套路就是这样

    //raw函数的使用
    println(raw"$f%2.2f") // 11.2356%2.2f，除了$获取变量值外，其他的字符原样输出了
    println(s"$f%2.2f") // 11.2356%2.2f
    // s函数和raw函数结果一样，那么他俩有啥区别呢
    println(raw"$f%2.2f\t回车") // 11.2356%2.2f\t回车， 真正的原样输出
    println(s"$f%2.2f\t回车") // 11.2356%2.2f	回车， \t未原样输出，被解析制表符


    // 三引号字符串，stripMargin是字符串的函数，忽略边界
    val s1: String =
      """
        |i
        |am
        |learning
        |scala
        |""".stripMargin
    println(s1) // 原样输出，注意不会输出|,会有回车换行

    // 三引号字符串同样可以使用s,raw等函数
    val s2 =
      s"""
         |The
         |value
         |is
         |$a
         |""".stripMargin
     println(s2)

    // raw
    val s3 =
      raw"""
           |$a \txx
           |""".stripMargin
   println(s3)


  }
}
```

## 键盘输入

键盘输入一般在开发交互式的程序中很有用。

常用基本语法

`StdIn.readLine()`,`StdIn.readShort()`,`StdIn.readDouble()`，`StdIn.readInt()`等等

示例

```scala
package io.itlab1024.github.scala.chapter02

import scala.io.StdIn

object Test05_StdIn {
  def main(args: Array[String]): Unit = {
    println("请输入姓名")
    val name = StdIn.readLine()
    println("请输入年龄")
    val age = StdIn.readInt()
    println(s"$name 的年龄是$age")
  }
}

```

![绿色部分是用户输入部分](https://raw.githubusercontent.com/ITLab1024/picgo-images/main/202205250946966.png)

## 文件输入输出（IO）

文件输入主要使用到是scala中的`scala.io`包内容，但是scala并没有提供文件输出api，需要调用java的API实现

```scala
package io.itlab1024.github.scala.chapter02

import java.io.PrintWriter
import scala.io.Source

/**
 * 文件的输入输出
 *
 * @author itlab1024
 */
object Test06_FileIO {
  def main(args: Array[String]): Unit = {
    // 从文件中读取数据，使用scala.io包下的相关包
    // 读取文件主要分为三个步骤,1：打开文件流，2：读取文件，3：关闭文件流
    val bufferedSource = Source.fromFile("src/main/resources/read.text")
    bufferedSource.foreach(print)
    bufferedSource.close()

    // 写内容到文件,scala中没有实现写文件的api，我们需要通过调用Java的api来实现
    val writer = new PrintWriter("src/main/resources/write.txt")
    writer.write("I am learning scala")
    writer.close()
  }
}
```

## 数据类型

数据类型是任何一门语言的重点，scala也不例外。

学过java的应该知道Java有8个基本类型`char`，`byte`，`short`，`int`，`long`，`float`，`double`，`boolean`

还有上面8中类型对应的引用类型，以及`String`或者是自定义的引用类型。

scala是纯面向对象的语言，没有基本类型概念，我们通过官网一张图来看下类型继承关系。

![Scala Type Hierarchy](https://raw.githubusercontent.com/ITLab1024/picgo-images/main/202205252032768.svg)

* Scala中一切数据都是对象，并且是`Any`的子类。
* Scala中主要分为两种数据：`数值类型(AnyVal)`和`引用类型(AnyRef)`。
* Scala和Java一样，低精度的数值类型自动转换为高精度的类型。
* Scala中的`String Ops`是Java中`String`的增强
* Unit：等价于Java中的`Void`空值类型，标识方法没有返回值
* Null：Scala中的`Null`是所有应用类型的子类
* Nothing：是所有类型的子类，主要用在一个函数没有明确返回值时使用，因为这样我们可以把抛出的返回值返回给任何的变量或者函数



| 数值类型 | 说明                                                         |
| -------- | ------------------------------------------------------------ |
| Boolean  | `true`或者`false`                                            |
| Byte     | 8 位有符号补码整数（-2^7 到 2^7-1] 也就是：-128 到 127       |
| Short    | 16 位有符号补码整数（-2^15 到 2^15-1] 也就是 -32,768 到 32,767 |
| Int      | 32 位二进制补码整数（-2^31 到 2^31-1，含]-2,147,483,648 到 2,147,483,647 |
| Long     | 64 位二进制补码整数（-2^63 到 2^63-1]                        |
| Float    | 32 位 IEEE 754 单精度浮点 1.40129846432481707e-45 到 3.40282346638528860e+38 |
| Double   | 64 位 IEEE 754 双精度浮点4.94065645841246544e-324d 到 1.79769313486231570e+308d |
| Char     | 16 位无符号 Unicode 字符（0 到 2^16-1，含）0 到 65,535       |
| String   | 字符串，由多个Char组成                                       |



按照上面的说明可以看到基本都是`-2^(n-1)到2^(n-1) -1`，那么为什么是是这样呢

我们以`Byte`来举例说明，`Byte`是1个字节（byte），8位存（bit）储的。请注意总共有8位（bit）。

首先有符号数用第一位（正着数）标识符号位`1`代表负数，`0`代表整数，那么剩下的7位就是数值位

`1符号位+7数值位=8位`

那么7位能够表示多少个数呢？应该是2的7次方。范围应该是`0-127`，再加上符号位就能够代表+(0-127)和-(0-127)，但是0是重复了，正数0（0000 0000）和负数0（1000 0000）其实是一样的。这就浪费了，所以规定正0是0，负0代表最大的负数(-128）。

示例

```scala
package io.itlab1024.github.scala.chapter02

/**
 * 数据类型操作
 */
object Test07_DataType {
  def main(args: Array[String]): Unit = {
    // Boolean类型
    var b1: Boolean = false
    b1 = true


    // Byte
    var a: Byte = 127 //正确
    //    a = 128 // 编译出错
    //    a = -129 // 编译出错

    var b = 128 //128默认是Int

    // Long,可以不指定类型通过以L（l）结尾，建议使用大写。
    val c: Long = 122
    val c1 = 122L


    // 自动转化类型，下面的10和20默认是Int，相加=30，是在Byte范围内的，这是允许的。
    val d: Byte = 10 + 20 // IDEA提示类型不匹配（可能觉得后面应该是INT），但实际是可以运行的
    println(d) //30

    val e: Byte = 10
    //    val f: Byte = e + 20  // 编译器提示类型不匹配，这次匹配是确实不能执行的，这是因为这段代码只有到运行时才能获得b1的数据才能执行。
    // 可以使用强制类型转换
    val f: Byte = (e + 20).toByte // 使用toByte强制转化为Byte类型

    // 超过范围情况
    val g: Byte = 127 // 127是Byte的最大正数
    val h: Byte = 1
    //    val i: Byte = g + h// 运行会报错，因为127 + 1 = 128 超出了Byte范围，而是一个Int值。使用Byte接收是不允许的。

    // 浮点类型
    val j = 1.23 //默认是Double类型
    // 可以使用F(f)指定Float类型
    val j1 = 1.23F

    // 字符类型，标识单个字符,当然也包括控制字符（\t,\n等）
    val k: Char = 'a'
    val l: Char = '\t'
    val m: Char = '\\' // 如果想打印\需要使用转义

    // Char类型在计算机底层保存的是实际字面看到的字符吗？其实不是，真正保存的其实是ASCII码
    val n: Int = k
    println(n) // 97 ，也就是说字符'a'实际的整数值是97。

    // 整数转化为Char
    println(98.toChar) // b


    // Unit
    val o: Unit = ()
    // Null
    val p: Null = null
    // Nothing,比如下面方法可以返回Nothing，但是实际并不这么做，因为他是所有类型的子类
    def  nothingTest() : Nothing = {
      throw RuntimeException // 必须抛出异常，否则提示返回类型应该是Void
    }
    //实际我们可能会这样做
    def nothingTest(i: Int) : Int = {
      if (i == 0)
        throw RuntimeException // 必须抛出异常，否则提示返回类型应该是Void
      else
        i
    }

  }
}

```



## 类型转换

Scala中的数据转换规则跟Java的一样

当Scala程序在进行赋值或者运算时，精度小的类型自动转换为精度大的数值类型，这就是自动类型转换（也叫做隐式转换）。

![类型精度排序图，从上到下，从大到小](https://raw.githubusercontent.com/ITLab1024/picgo-images/main/202205271728900.jpeg)

基本说明：

​	自动转换原则：多种类型混合运算时，系统会先自动将所有类型转换为精度大的类型，然后再做运算。

​	将精度大的赋值给精度小的数值类型时就会报错，反之自动转换

​	(`Byte`和`Short`)和`Char`之间不会自动相互转换

​	`Byte`，`Short`，`Char` 三者运算会先转换为`Int`类型



示例

```scala
package io.itlab1024.github.scala.chapter02

/**
 * 数据类型转换
 */
object Test08_DataTypeConversion {
  def main(args: Array[String]): Unit = {
    //    自动转换原则：多种类型混合运算时，系统会先自动将所有类型转换为精度大的类型，然后再做运算。
    val a: Byte = 10
    val b: Long = 23L
    //    val c: Int = a + b // 编译错误，提示结果是Long，不允许用Int类型常量接收
    val d: Int = a + b.toInt //这就没有问题，因为我将b通过toInt方法强制转换为Int，而a是Byte会自动提升为Int，计算结果是Int

    //    将精度大的赋值给精度小的数值类型时就会报错，反之自动转换
    val e: Int = 1
    val f: Long = e //自动转换为高精度类型
    //    val g: Byte = e // 错误

    //   (`Byte`和`Short`)和`Char`之间不会自动相互转换
    val h: Byte = 1
    //    val i: Char = h // 错误
    val j: Short = 1
    //    val k: Char = j //错误


    //   `Byte`，`Short`，`Char` 三者运算会先转换为`Int`类型
    //    val l: Short = h + j // 错误提示应该是Int

    //数值类型和String的互相转换（重点，平时开发中常用）
    // 数值转String
    val m: Int = 1
    val n: String = m + ""

    // String转换为数值
    val o: String = "1"
    val p: Int = o.toInt // 直接调用toInt方法

    // 注意异常问题
    //    val q : Int = "1.1".toInt //编译不报错，运行是不允许的。


    // 数据溢出问题
    val r: Int = 200 //200肯定超过了Bye的范围
    val s: Byte = r.toByte
    println(s)// 结果是-56 则是因为精度缺失了。
    /*我们分析下，Int是32位，
    200的原码是：
    00000000 00000000 00000000 11001000
    补码
    00000000 00000000 00000000 11001000

    那么转化为Byte的时候要截取1个自己8位，得到结果是11001000，那他的原码就是取反(00110111),再加一(10111000),结果就是-56
    */
  }
}

```

# 运算符

Scala中的运算符和Java中的基本相同。



## 算术运算符

算术运算符主要有`+`，`-`，`*`，`/`，`%`，不做详细介绍。

| 运算符 | 说明                                                         |
| ------ | ------------------------------------------------------------ |
| +      | 加法运算，可以作用于数值也可用于字符串连接，比如 1+1、"a" + "b" |
| -      | 减法                                                         |
| *      | 乘法                                                         |
| /      | 除法                                                         |
| %      | 求余 10/3 = 1                                                |



## 关系运算符（比较运算符）

关系运算符主要有`==`，`!=`，`<`，`>`，`<=`，`>=`，也跟Java基本相同，这里重点说下`==`,

还记得java中的`==`和`equals`方法的区别吗？`==`是代表比较引用是否相等，`equals`代表比较值是否相等，不好理解，scala中就简单了很多`==`就是判断值是否相等，`equals`也是判断的值是否相等。

那么scala中如何判断引用是否相等呢？`eq`方法。

| 运算符 | 说明                                         |
| ------ | -------------------------------------------- |
| ==     | 比较是否相等，对于引用类型，等价于equals方法 |
| !=     | 不等于                                       |
| <      | 小于                                         |
| >      | 大于                                         |
| <=     | 小于等于                                     |
| >=     | 大于等于                                     |



## 逻辑运算符	

逻辑运算符有`&&`，`||`，`！`

| 运算符 | 说明                                                         |
| ------ | ------------------------------------------------------------ |
| &&     | 短路与，比如 a > b && c > d，如果a > b == false,则后面的c > d 不会执行。 |
| \|\|   | 短路或， 比如 a > b \|\| c > d， 如果a>b == true,则后面的c > d不会运行。 |
| !      | 非，如果 a  == false, 则!a = true                            |



## 赋值运算符

`=`，`+=`，`-=`，`*=`，`/=`，`%=`，`>>=`，`<<=` 跟Java也一样，不说了。

需要注意的是scala中没有`++`，`--`运算符，java中有这个两个运算符，有坑，新手可能会进入误区。scala这点还是比较好的。

| 运算符 | 说明                     |
| ------ | ------------------------ |
| =      | 复制 val a = 1 ,给a赋值1 |
| +=     | 先相加再赋值             |
| -=     | 先做减法在赋值           |
| *=     | 先做乘法再赋值           |
| /=     | 先做除法再赋值           |
| %=     | 先求余再赋值             |
| >>=    | 先向右位移再赋值         |
| <<=    | 先向左移再赋值           |



## 位运算符

| 运算符 | 说明     |
| ------ | -------- |
| &      | 按位与   |
| \|     | 按位或   |
| ^      | 按位异或 |
| ~      | 按位取反 |
| <<     | 左移     |
| >>     | 右移     |

## 运算符的本质

scala中的运算符都是方法。

比如+我们也可通过类似方法调用的方式使用。

```scala
val i = j.+(1)
```



# 流程控制

## if-else

***

基本语法

```scala
if（条件） {
	// 当条件是true的时候执行此处代码
} else {
  // 当条件是false的时候执行此处代码
}
```

用法与java基本一致。

**特别之处**

scala中每个表达式都是有返回值的，一是要保证每个分支返回类型相同，如果确实不同，则接收者类型要使用不同类型的父类。

```scala
package io.itlab1024.github.scala

import scala.io.StdIn

/**
 * if - else控制
 */
object Test01_IfElse {
  def main(args: Array[String]): Unit = {
    // if else
    val a: Int = 1
    if (a > 0) {
      println("正数")
    } else if (a == 0) {
      println("0")
    } else {
      println("负数")
    }




    // if else的返回值
    val b: Int = 10
    val c : Unit = if (b > 0) {
      println("测试返回值")
    }
    println(c) // ()

    // 多分支情况要保证最后返回的类型相同
    val d : String = if (b > 0) {
      println("测试返回值") // 此处返回是Unit，而else中返回是String，而接收者d的类型是String，这是不允许的（假设下行字符串代码没有）。
      "此处也返回String，保证每个分支返回的数据类型格式统一"
    } else {
      return "abc"
    }
  }
}

```



## match模式匹配

scala中没有`switch`，取而代之的是`match`

相比于Java，scala中的match，没有break关键字，使用`_`代表默认分支

```scala
package io.itlab1024.github.scala.chapter04

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

```



match还支持匹配`case class`后面学到的时候再用。

## for循环

### 范围循环

主要使用`to`和`until`关键字来实现范围循环，其中`to`标识包含左右边界值，比如 `0 to 10`包含0和10，`until`则不包含10

```scala
 // 普通范围循环,使用to关键字,包含左右边界值
 for (i <- 0 to 10) {
 println(i)
 }

// 也可以使用until方法， 不包含后面的边界值
for (i <- 0 until 10) {
println(i)
}
```

### 循环守卫

循环守卫的意思是说允许在for循环范围语句后面增加if表达式，只有当表达式=true的时候才进行循环

```scala
// 循环守卫
val b : Int = 0
for (i <- 0 to 10 if b > 1) {
//永远不会执行，因为循环守卫 b > = 结果是false
}
```

### 循环步长

上面我们使用的for循环都是默认一步加一，有时候我们可能希望自定义步长。scala中使用`by`关键字来控制步长（步长不能是0 否则抛出异常，并且还能是小数）

```scala
// 循环步长
for (i <- 1 to 10 by 2) {
	println(i) //1 3 5 7 9
}
// by 后也可以使用负数，当从大到小遍历的时候有用
for (i <- 20 to 1 by -2) {
  println(i) //20,8,16,14,12,10,8,6,4,2
}
// 步长能使用小数吗？可以，要求to前后也必须是小数，也就是类型一致
for (i <- 1.3 to 10.0 by 22.0) { //会提示to过期，使用BigDecimal，因为Double和Float计算结果取决于操作系统，会出现不准确。
  println(i) //1 3 5 7 9
}
//使用BigDecimal
for (i <- BigDecimal.decimal(1.3) to 10.0 by 22.0) { //会提示to过期，使用BigDecimal
  println(i) //1 3 5 7 9
}
```

### Reverse

```scala
// 和下面的for循环等价
for (i <- 20 to 1 reverse) {
	println(i) 
}

for (i <- 1 to 20) {
	println(i)
}
```

### 引入变量

```scala
// 引入变量,j就是引入的变量，两个表达式用;隔开。
for (i <-0 to 10 ; j = i + 1) {
  println(s"i=$i, j=$j")
}
```

### 循环返回值

scala中默认情况下返回的是Unit，必须使用`yeild`关键字来实现不同的返回值。

```scala
//循环返回值
val s1: Unit = for (i <- 1 to 10) {
	"结果"
}
println(s"s1 = $s1") //s1 = ()

val s2 = for (i <- 1 to 10) yield {
	"结果"
}
println(s"s2 = $s2") // s2 = Vector(结果, 结果, 结果, 结果, 结果, 结果, 结果, 结果, 结果, 结果)

// 将i都乘以2 ，最终返回一个数组
val s3 = for (i <- 1 to 10) yield {
  i * 2
}
println(s3) //Vector(2, 4, 6, 8, 10, 12, 14, 16, 18, 20)
```

### while和do...while

和Java中完全一样，do while即便条件表达式不成立也会先执行一次。

### 循环中断

Java中关于循环中断有两个关键字`break`和`continue`，scala中没有这两个关键字，要使用`breakable`来实现，也可以使用`try catch`来实现。

```scala
// 循环中断
// try catch
try {
  for (i <- 0 to 10) {
    if (i == 1) {
      throw new RuntimeException
    }
  }
} catch {
  case e: Exception => // 什么也不做，退出循环
}
// try catch 虽然可时间，但是有点麻烦， 可以用breaks下的break方法
Breaks.breakable(for (i <- 0 to 10) {
  if (i == 1) {
    Breaks.break();
  }
})
```

我只想说不如java的break方便。我觉得就是为了体现面向对象的思想。但是确实要麻烦了点。



# 函数式编程

## 函数基本语法

```scala
def 函数名 (参数变量: 参数变量类型) : 返回类型 {
  //函数体
}
```

## 函数定义

scala中的函数类似java支持0个或者多个参数，不同于java的是scala中的函数还支持多个返回值

### 单返回值

```scala
// 函数，求两个整数的和
def sum (x: Int, y: Int) : Int = {
	x + y // 可以省略return 这是scala中函数的特点
}
```



### 多个返回值

比如给定两个数返回两个数的和以及差值

```
// 多返回值
def sumAndDes(x: Int, y: Int): (Int, Int) = {// 多个返回值用括号包裹起来
	return (x + y, x - y) // return可以省略
}
```



**可变参数**

可变参数可以通过 在类型后使用`*`来定义

```scala
// 可变参数
def printlnValues(values: String*)  = {
}
```

### 参数默认值

```scala
//参数默认值
def defaultParmasFunc(x: Int = 10) = {}
```

### 带名参数

```scala
// 带名参数
def namedParamFunc(name: String, age: Int): Unit = {
	// 函数体
}
namedParamFunc(name = "张三", age = 10) // 调用的时候可以指定名称
```

## 函数至简原则

* return可以省略，scala使用函数体最后一个代码作为返回值
* 如果函数体只有一个行代码，大括号可以省略
* 返回值类型如果能够推断出来，那么可以省略
* 如果有return，则不能省略返回值类型，必须指定
* 如果函数明确声明Unit，那么即便函数体中使用return也不会起作用
* scala如果无返回值类型，可以省略等号
* 如果函数无参，但是声明了参数列表，那么调用时小括号可以省略
* 如果函数没有参数列表，那么小括号可以省略，调用时小括号必须省略
* 如果不关心名称只关心处理逻辑，那么def关键字可以省略，这就是匿名函数

代码示例：

```scala
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
```



## 函数的值传递

```scala
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
```

## 函数作为参数传递

```scala
// 函数可以作为函数参数传递
    // 定义一个二元计算,下面的dualEval是一个函数，参数是op也是一个函数，此函数的参数列表是Int类型的a和b
def dualEval(op: (Int, Int) => Int, a: Int, b: Int): Int = {
  op(a, b)
}

def op(a: Int, b: Int): Int = {
  a + b
}

println(op(1, 2)) // 3
```

## 函数可以作为函数的返回值

```scala
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
```

## 练习

```scala
val arr: Array[Int] = Array(1, 2, 3)

// 对数组进行处理，将操作抽象出来，处理完毕的结果返回一个新的数组
def arrayOperation(array: Array[Int], op: Int => Int): Array[Int] = {
  for (a <- array) yield op(a)
}

// 定义一个+1操作
def addOne(i: Int): Int = i + 1

// 我们先对数组arr进行加一，返回新的数组
val newArr = arrayOperation(arr, addOne)

println(newArr.mkString(",")) // 2,3,4
```

## 函数柯里化&闭包

闭包：如果一个函数，访问到了他的外部（局部）变量的值，那么这个函数和他所在的环境，就称为闭包

函数柯里化：把一个参数列表的多个参数，编程多个参数列表。

```scala
 // 闭包
def add(i: Int): Int => Int = {
  def add2(j: Int): Int = {
    i + j
  }

  add2
}

val f1 = add(1) //f1是一个函数
println(f1(2)) // 3

// 函数柯里化，比如上面的闭包就可以写成如下模式，并且推荐使用函数的库里化
def addCurrying(a: Int)(b: Int): Int = {
  a + b
}
println(addCurrying(1)(2))
```



## 递归

自己调用自己就是递归。

示例：n的阶乘，比如5！= 1x2x3x4x5;

```scala
package io.github.itlab1024.scala.chapter05

/**
 * 递归
 */
object Test04_Recursion {
  def main(args: Array[String]): Unit = {
    println(fact(5))
  }

  def fact(n: Int): Int = {
    if (n == 0) return 1
    fact(n - 1) * n
  }

}

// 递归有什么问题呢?会出现栈帧过多，出现Stack Overflow错误，在scala中如何解决呢？
def fact2(n: Int) : Int = {
  @tailrec
  def work(n: Int, result: Int) : Int = {
    if (n == 0) return result
    work(n-1, result * n)
  }
  work(n , 1)
}
println(fact2(5)) // 结果也是120，但是这种方式就不会增多栈帧数量
```



## 控制抽象

```scala
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
```

## 懒加载

当函数返回值被声明为`lazy`的时候，函数的执行将被推迟，知道我们首次对其取值，该函数才会运行，这种函数被称为惰性函数

类似于Java JPA中的lazy的概念。

```scala
package io.github.itlab1024.scala.chapter05

object Test06_LazyFunc {
  def main(args: Array[String]): Unit = {
    lazy val i = addOne(1)
    println(i) // 如果注释掉改行，也就是i不被使用，则addOne方法不会被执行
  }

  def addOne(i: Int): Int = {
    println("addOne方法被调用")
    i + 1
  }
}

```

# 面向对象编程

Scala中的面向对象基本和Java相同，我是个javaer，一样的地方我就不写了。主要记录下不同的地方。

## 包

scala有两种包的管理方式，一种和java一样，一个源文件在一个包下（包名和文件所在路径不要求一致），另外一种是scala中支持包名的嵌套

该种方式的特点是：

一个源文件可以有多个包

子包中的类可以直接访问父包汇总的内容，无需导包

```scala
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
```

## 包对象

在scala中可以为每个包定义一个同名的包对象，定义在包对象的成员，做为其对应包下的所有class和objcet的共享变量，可以直接访问。

```scala
package io.github.itlab1024.scala

package object chapter06 {
  // 定义共享的值
  val sharedValue1 : Int = 1
  // 定义共享方法
  def pkgName() : String = {
    "io.github.itlab1024.scala.chapter06"
  }
}

// 调用包对象
package io.github.itlab1024.scala.chapter06

object Test02_PackageObject {
  def main(args: Array[String]): Unit = {
    // 调用包对象的方法和成员
    println(sharedValue1)
    println(pkgName())
  }
}


```

## 包导入

跟java相同，有以下不同之处

* 嵌套包可以不通过的包下import，这是局部引入，只在当前包下有效。
* 可以屏蔽某一个类，比如`import java.util.{HashSet => _,_}`
* 导入相同包的多个类，用`{}`括起来，逗号分隔
* 。。。。。。

```scala
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
// 有些就不尝试了，感觉用处不大
}
```

## 类和对象

类和对象的定义跟java一样，类可以看成一个模板，对象可以认为是一个具体的事务

注意：在scala中没有public关键字（默认就是public的），一个.scala文件中可以定义多个类。

基本语法：

```tex
[修饰符] class 类名 {
	//类的body体
}
```

示例

```scala
package io.github.itlab1024.scala.chapter06

import scala.beans.BeanProperty

object Test04_Class {
  def main(args: Array[String]): Unit = {
    val it = new IT
    it.name //可以访问
    //    it.age // 因为是private，不能访问
    // 赋值
    //    it.name = "itlab1024" // val常量不能变更值
    it.weibo = "itlab" // 可以
    // homeUrl 我们加了 @BeanProperty注解，就可以使用get和set方法
    it.setHomeUrl("")
    it.getHomeUrl
  }
}

// 定义一个类
class IT {
  // 定义属性和方法
  val name: String = "itlab"
  // 可以定义为私有的

  private var age: Int = 1
  @BeanProperty // @BeanProperty 提供getter方法和setter方法
  var homeUrl = "itlab1024.github.io"

  var weibo: String = _

}
```

