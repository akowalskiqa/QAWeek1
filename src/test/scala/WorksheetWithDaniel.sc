def doThis(input:Array[Int]): Unit ={
  var inputCopy = input
  for(i<- 0 to inputCopy.length-1) {
    val placeHolder = inputCopy(i)

    input.foreach(item =>)
  }
  for(i<- 0 to input.length-1){

    calculate(input(i),)
  }

  }
  var resultsList = List[Int](input.foreach(item=> input.foreach(value=> value * item)))
}

def checkWetherExists(map:Map,initialInputList:Array[Int]): Boolean ={
  initialInputList.foreach(item=> if(map.contains(item)))
}

def calculate(a:Int,b:Int): Unit ={
  var mapContainer = scala.collection.mutable.Map[Int, String]()
  mapContainer.put(a*b,(a.toString + "*"+ b.toString+"="+ (a*b).toString))
  mapContainer.put(a/b,(a.toString + "/"+ b.toString+"="+ (a/b).toString))
}

doThis(Array[Int](4,2,8))

import scala.collection.mutable.ArrayBuffer

var calculator = (input:ArrayBuffer[Int]) =>{
  for(x <- 0 to input.length-1){
    for(y <- 0 to input.length-1){if(x != y) {
      for(z <- 0 to input.length-1) {

        if (input(x)+input(y) == input(z)) println(input(x) + " + " + input(y) + " = " + (input(x) + input(y)))
        if (input(x)-input(y) == input(z))println(input(x) + " - " + input(y) + " = " + (input(x) - input(y)))
        if (input(x)/input(y) == input(z))println(input(x) + " / " + input(y) + " = " + (input(x) / input(y)))
        if (input(x)*input(y) == input(z))println(input(x) + " * " + input(y) + " = " + (input(x) * input(y)))
      }
    }

    }
  }
}

var input = ArrayBuffer[Int](3, 5, 15)
calculator(input)