class Sort {
    def isort(list: List[Int]): List[Int] =
      if (list.isEmpty) Nil
      else insert(list.head, isort(list.tail))

    def insert(num: Int, list: List[Int]): List[Int] = {
      if (list.isEmpty || num <= list.head) num :: list
      else list.head :: insert(num, list.tail)
    }

}
object main extends App {
  val list = List(9,67,45,3,2,9,0)
  val obj = new Sort
  println(obj.isort(list))

}
