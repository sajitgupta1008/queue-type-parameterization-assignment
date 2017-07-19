
class Invariant_Queue[T](
                private val leading: List[T],
                private val trailing: List[T]
              ) {
  def head = mirror.leading.head

  def tail = {
    val q = mirror
    new Invariant_Queue(q.leading.tail, q.trailing)
  }

  private def mirror =
    if (leading.isEmpty)
      new Invariant_Queue(trailing.reverse, Nil)
    else
      this

  def enqueue(x: T) =
    new Invariant_Queue(leading, x :: trailing)

override  def toString:String = (leading ::: trailing.reverse).toString()
}

object queue1 extends App{

  val q1 = new Invariant_Queue[Int](List(1,2,3,4), Nil)
  println(q1)

  val q2 = q1.enqueue(5)
  println(q2)

  val q3 = q2.tail
  println(q3)


}
