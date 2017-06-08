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

