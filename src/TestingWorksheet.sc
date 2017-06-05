def printThis(): String ={
  return("hello ")
}

def printThisTest(){
  print(printThis())
}

printThisTest()

def checkThis(name:Any){
  println(name)
}

checkThis(1.2312)

def twoParameters(test:String,number:Int) ={

  var a: String = test.substring(test.size-number,test.size)
  println(a)
}
twoParameters("Hello",3)

def fourParameters(a:String,b:String,c:Char,d:Char) ={
  var ab:String = a+b
  ab = ab.replace(c,d)
  ab
  }
print(fourParameters("Ha","llo",'a','e'))

def sumTwo(a:Int,b:Int,c:Boolean): Int = {

  if(a==0){
    b
  }else if(b ==0){
    a
  }else if(a ==0 && b==0){
    0
  }else if(c){
    a+b
  }else{
    a*b
  }
}
sumTwo(0,10,false)
sumTwo(2,0,true)

sumTwo(2,5,true)
sumTwo(2,5,false)


def printAmount(a:String,b:Int): Unit ={

    for(i<- 0 until b){
    println(a)
      b-1
  }
}
printAmount("Hi",3)

def printAmountRec(a:String,b:Int): Unit ={
  if(b>0){
    println(a)
  printAmountRec(a,b-1)}
}
printAmountRec("hi",3)

def printRectangle(a:String,b:Int): Unit ={
  var output:String = ""
  for(i<-0 until b){
    output = output+a
  }
  for(i<-0 until b){
    println(output)
  }
}
printRectangle("H",4)

def printRectangleRecursive(a:String,b:Int): Unit ={
  var finalText:String = ""
  var c:Int = b
  var d = b
  while(d>0){
    finalText = concatenate(finalText,a)
    d-=1
  }
  while(c>0){
    println(finalText)
    c-=1
  }
}
def concatenate(text:String,word:String): String ={
  var output:String =text+word
  output
}
printRectangleRecursive("H",6)

def printAmountRecursive(a:String,b:Int): Unit ={
  println(a)
  if(b>0){
  printAmountRecursive(a,b-1)}
}
printAmountRecursive("Hi",3);

def fizzBuzz(a:String,b:String,c:Int): Unit= {
  recursiveFizzBuzz(a,b,c,1)
}
fizzBuzz("Fizz","Buzz",15)

def recursiveFizzBuzz(a:String,b:String,c:Int,d:Int): Unit={
  if(d%3==0&&d%5==0){
    println(a+b)
  }else if(d%3==0){
    println(a)
  }else if(d%5==0){
    println(b)
  }else{
    println(d)
  }
  if(d<c){
    recursiveFizzBuzz(a,b,c,d+1);
  }
}


def reWriteConditional(a:Int,b:Int,c:Boolean): Int = {

  if(a==0){
    b
  }else if(b ==0){
    a
  }else if(a ==0 && b==0){
    0
  }else if(c){
    a+b
  }else{
    a*b
  }
}







