class CoVariantQueue[+T](
                          private val leading: List[T],
                          private val trailing: List[T]
                        ) {

  override def toString = (leading ::: trailing.reverse).toString

}

object Queue extends App {

  val CatObj1 = new Lion
  val CatObj2 = new Lion
  val CatObj3 = new Lion
  val CatObj4 = new Lion


  val covariantQueue = new CoVariantQueue[Lion](List(CatObj1,CatObj2,CatObj3,CatObj4), Nil)
  val animalQueue: CoVariantQueue[Animals] = covariantQueue
  println(animalQueue)

}


