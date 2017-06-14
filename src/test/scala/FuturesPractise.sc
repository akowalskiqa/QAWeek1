import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

var collection = List("John","Billy","Joe")

object Futuretest{

  println("This is first")
    val f = Future{
      println("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF")


    }
    val c = Future{
      println("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC")

    }


      println("printing last")
  Thread.sleep(10000)
}

def makeAFuture(listOfPeople:List[String]): Unit ={

  val f = Future{
    println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA")
  }
}

makeAFuture(collection)