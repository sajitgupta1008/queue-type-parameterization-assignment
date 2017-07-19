/**
  * Created by knoldus on 18/7/17.
  */
class ContraVariantQueue[-T]{

  def output(x: T) = println(x)

}

object Queue2 extends App {

  val contravariantQueue = new ContraVariantQueue[Cat]
  val tigerQueue: ContraVariantQueue[Tiger] = contravariantQueue
 // val animalQueue: ContraVariantQueue[Animal] = catQueue

  println(tigerQueue)

}
