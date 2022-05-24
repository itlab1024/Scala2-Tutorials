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

### 注释

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

### 常量和变量

常量使用`val` 声明，变量说过`var`声明

var 常量名[: 类型] = 初始值

val 变量名[: 类型] = 初始值

注意：能用常量的地方不用变量

```scala
package io.itlab1024.github.scala.chapter02

import io.itlab1024.github.scala.chapter01.ScalaDrink

class Test02_Variable {
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

### 标识符命名规范

什么是标识符？scala中对变量、常量、方法、函数名字统称为标识符

scala中的标识符命名规则基本与java一致。

1. 标识符由字母、数字、下划线组成，但是首字母必须是字母或者下划线

2. 以操作符开头，且只能包含操作符（#-*/#!等）

3. 用反引号``将任意字符串包起来，这是合法的标识符，即便是scala中的关键字也是可以的，

   scala中的关键字主要有

   * `package`，`import`，`class`，`object`，`trait`，`extends`，`with`，`type`，

   `for`

   * `private`，`protected`，`abstract`，`scaled`，`final`，`implicit`，`lazy`，`override`
   * `if`，`else`，`match`，`case`，`do`，`while`，`for`，`return`，`yield`
   * `def`，`var`，`val`
   * `this`，`super`
   * `new`
   * `true`, `false`, `null`

**示例**

