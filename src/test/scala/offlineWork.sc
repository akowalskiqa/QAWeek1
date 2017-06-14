def doubleChar(input:String): String ={
 var newOutput:String = ""
  for(i<- 0 to input.length-1){newOutput+=input(i);newOutput+=input(i)}
  newOutput
}
doubleChar("The")

def getSandwich(input:String): String ={
  if(input.indexOf("bread")!= input.lastIndexOf("bread")){input.substring(input.indexOf("bread")+5,input.lastIndexOf("bread"))}
  else ""
}
getSandwich("breadjambread")
getSandwich("xxbreadjambreadyy")
getSandwich("xxbreadyy")


def evenlySpaced(a:Int,b:Int,c:Int): Boolean ={
  var list = List(a,b,c).sorted
  val cBDifference = list(2) - list(1)
  if(cBDifference == list(0)){true}
  else false
}
evenlySpaced(4,6,2)
evenlySpaced(4,6,3)


//def fibonacci(number:Int): Unit ={
 // if(number==0){1}
 // else{fibrecursive(1,number)}
//}
//def fibrecursive(current:Int,number:Int): Unit ={
  //if()

  //fibrecursive()
//}

def bunnyEars(bunnies:Int): Unit ={
  bunnyRecursive(bunnies,0)
}
def bunnyRecursive(bunnies:Int,totalears:Int): Unit ={
    if(bunnies>0){bunnyRecursive(bunnies-1,totalears+2)}
    else{println(totalears)}
}
bunnyEars(5)

def nTwice(stringInput:String,n:Int): String ={
  var newString=""
  newString += stringInput.substring(0,n); newString+= stringInput.substring(stringInput.length-n,stringInput.length)
  newString
}
nTwice("Chocolate",1)

def endsLy(input:String):Boolean={
  if(input.substring(input.length-2,input.length)=="ly"){true}
  else false

}
endsLy("oddlya")
endsLy("oddly")

def stringClean(stringInput:String): String ={
  val output = stringCleanTail(0,stringInput)
  output
}

def stringCleanTail(currentIndex:Int,currentClean:String): String ={
  var newString = ""
 println(currentIndex + " "+currentClean.length)
  if(currentIndex<currentClean.length-1) {
    if (currentClean(currentIndex) == currentClean(currentIndex + 1)) {println("found a match")
      newString += currentClean.substring(0, currentIndex);
      newString += currentClean.substring(currentIndex+1, currentClean.length);
      stringCleanTail(currentIndex , newString)
    }
    else stringCleanTail(currentIndex + 1, currentClean)
  }else currentClean
}
stringClean("aaaaabbbbdddee")