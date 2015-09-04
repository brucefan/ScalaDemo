package scala.highorder

/**
 * Created by bruce01.fan on 2015/9/4.
 */
class ListFuns {

  def listFuns(): Unit ={
    val list = List("a","b","c","d","e")
    list.isEmpty // false
    Nil.isEmpty // true Nil为空集合
    println(list.length)
    list.size
    // head 首元素
    println(list.head)
    // tail 除了首元素
    println(list.tail)
    // ---> 不会对原list元素发生改变，val不变的
    // 反转集合
    println(list.reverse)
    // drop == remove
    list.drop(1)

    val words = List("peg","al","bud","kelly")
    // 计算word大于2的数量
    words.count(word => word.size > 2)
    // 过滤掉word大于2的
    words.filter(word=>word.size>2)
    // 使用word长度组成一个新的list
    words.map(word=>word.size)
    //
    words.sortWith(_<_)
    words.sortWith((s1:String,s2:String)=> {s1.length > s2.length})

    // foldLeft
    val intList = List(1,2,3,4,5,10)
    /*
        /: 需要一个初始值和代买块 ，代码块有两参数
        /: 将初始值0和第一个元素作为参数传入代码块。算成结果=1
        /: 将从代码块返回的结果1返送给算式中sum，然后i取第二个元素
        迭代至所有元素终结
     */
    val sum = (0/:intList){(sum,i)=>sum+i}
    println("sum -->" + sum)
  }
}
