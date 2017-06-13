import scala.io.Source

def readFromFile(): Unit ={
  val filename = "tryreadingfromthis"
  for (line <- Source.fromFile(filename).getLines()) {
    println(line)
  }
}