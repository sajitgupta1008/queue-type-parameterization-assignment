
class UpperBoundQueue[T](private val leading: List[T], private val trailing: List[T])  {

  def mirror =
    if(leading.isEmpty)
      new UpperBoundQueue[T](trailing.reverse, Nil)
    else
      this

  def enqueue[U <: T](x: U): UpperBoundQueue[T] = {
    new UpperBoundQueue[T](leading, x :: trailing)
  }

  def dequeue: UpperBoundQueue[T] = {
    val q = mirror
    new UpperBoundQueue[T](q.leading.tail, q.trailing)
  }

  override def toString = (leading ::: trailing.reverse).toString
}

object QueueAkshansh extends App {

  val CatObj1 = new Cat
  val CatObj2 = new Cat
  val CatObj3 = new Cat
  val CatObj4 = new Cat
  val CatObj5 = new Cat
  val tigerObj = new Tiger
  //val smallCatObj = new SmallCat(3)

  val smallcatQueue: UpperBoundQueue[Cat] = new UpperBoundQueue[Cat](List(CatObj1,CatObj2,CatObj3,CatObj4), Nil)
  println(smallcatQueue.enqueue(tigerObj))
 // println(smallcatQueue.enqueue(new Animals)) // Doesn't work

}