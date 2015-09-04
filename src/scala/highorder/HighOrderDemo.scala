package scala.highorder

/**
  *只能在object中定义main运行scala,在class中不行
 * Created by bruce01.fan on 2015/9/4.
  */
object HighOrderDemo {


   def main(args:Array[String]): Unit ={
       val list = List("frodo","samwise","pippin")
       //高阶函数
       // hobbit => println(x) 是一个匿名函数
       list.foreach(hobbit => println(hobbit))
       // 针对set同样可以使用
        val hobbits = Set("a","b","c")
        hobbits.foreach(h => println(h))

       val hobbitMap = Map("fordo"->"hobbit","samwise"->"hobbit","pippin"->"hobbit")
       // 返回 ("fordo","hobbit") ("samwise","hobbit")
       hobbitMap.foreach(h => println(h))
       // 打印 map - key
       hobbitMap.foreach(h=> println("key-> "+h._1))
       // 打印 map - value
       hobbitMap.foreach(h=> println("val->"+h._2))
   }

 }
