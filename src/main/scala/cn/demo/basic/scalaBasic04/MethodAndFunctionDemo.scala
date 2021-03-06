package cn.demo.basic.scalaBasic04

/**
  * @author y15079
  * @create 2018-02-27 11:38
  * @desc 方法和函数区别
  **/
object MethodAndFunctionDemo {
    //定义一个方法
    //方法m2参数要求是一个函数，函数的参数必须是两个Int类型
    //返回值类型也是Int类型
   def m1(f: (Int, Int) => Int) : Int = {
      //在方法体里面调用函数
      f(2, 6)
    }

  //函数第一种写法
  //定义一个函数f1，参数是两个Int类型，返回值是一个Int类型
  val f1 = (x: Int, y: Int) => x + y
  //再定义一个函数f2
  val f2 = (m: Int, n: Int) => m * n

  //函数第二种写法
  val f3:(Int, Int) => Int = {
    (m,n) =>  m * n
  }

  //main方法
  def main(args: Array[String]): Unit = {

    //调用m1方法，并传入f1函数
    val r1 = m1(f1)
    println(r1)

    //调用m1方法，并传入f2函数
    val r2 = m1(f2)
    println(r2)

    //调用m1方法，并传入f3函数
    val r3 = m1(f3)
    println(r3)
  }
}
