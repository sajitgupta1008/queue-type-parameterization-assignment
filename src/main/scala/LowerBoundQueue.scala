
/**
  * Created by knoldus on 18/7/17.
  */
class LowerBoundQueue[T]( val leading: List[T],  val trailing: List[T]) {

  def mirror =
    if(leading.isEmpty)
      new LowerBoundQueue[T](trailing.reverse, Nil)
    else
      this

  def enqueue[U >: T](x: U) = {
    new LowerBoundQueue(leading, x :: trailing)
  }

  def dequeue: LowerBoundQueue[T] = {
    val q = mirror
    new LowerBoundQueue[T](q.leading.tail, q.trailing)
  }

  override def toString: String = (leading ::: trailing.reverse).toString

}

object Queue3 extends App {

  val TigerObj1 = new Tiger
  val TigerObj2 = new Tiger
  val TigerObj3 = new Tiger
  val TigerObj4 = new Tiger

  val catObj = new Cat


  val catQueue: LowerBoundQueue[Cat] = new LowerBoundQueue[Cat](List(TigerObj1,TigerObj2,TigerObj3,TigerObj4), Nil)
println(catQueue)
  val appendedqueue = catQueue.enqueue(catObj)
  println(appendedqueue)


}