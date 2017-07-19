
class CoContraQueue[-S, +T] {

  def write(x: S): T = {
    x match {
      case res: T => res
    }
  }

}


object QueueCoContra extends App {

  val CatObj1 = new Cat
  val CatObj2 = new Cat
  val CatObj3 = new Cat

  val nonVariantQueue = new CoContraQueue[Cat, Lion]
  println(nonVariantQueue)

  val anotherqueue : CoContraQueue[Tiger, Animals] = nonVariantQueue
 // val another: CoContraQueue[Animals, Animals] = nonVariantQueue //doesnt work

  println(anotherqueue)
  println(nonVariantQueue.write(CatObj1))
  //println(nonVariantQueue.write(petAnimalObj))

}
