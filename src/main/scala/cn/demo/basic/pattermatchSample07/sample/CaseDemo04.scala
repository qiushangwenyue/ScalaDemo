package cn.demo.basic.pattermatchSample07.sample

import scala.util.Random

/**
  * @author y15079
  * @create 2018-02-28 18:56
  * @desc
  *      在Scala中样例类是一种特殊的类，可用于模式匹配。
  *      case class是多例的，后面要跟构造参数
  *      case object是单例的
  **/

case class SubmitTask(id: String , name: String)

case class HeartBeat(time: Long)

case object CheckTimeOutTask

object CaseDemo04 extends App {
  val arr = Array(CheckTimeOutTask, HeartBeat(12333), SubmitTask("0001","task-0001"))

  val a = CheckTimeOutTask
  val b = CheckTimeOutTask

  println(a)
  println(b) //为单例

  arr(Random.nextInt(arr.length)) match {
    case SubmitTask(id, name) => {
      println(s"$id, $name")
    }
    case HeartBeat(time) => {
      println(time)
    }
    case CheckTimeOutTask => {
      println("check")
    }
  }
}
