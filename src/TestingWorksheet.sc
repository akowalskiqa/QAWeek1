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

def fizzBuzzAttempt2(a:String,b:String,d:Int): Unit ={
  (1 to d).foreach(item=> println(if(item%3==0 && item%5==0){a+b}else if(item%3==0){a}else if(item%5==0){b}else{item}))
}
fizzBuzzAttempt2("Fizz","Buzz",20)

def fizzBuzzMap(a:String,b:String,d:Int):Unit={
  (1 to d).map(item=> if(item%3==0 && item%5==0){a+b}else if(item%3==0){a}else if(item%5==0){b}else{item} ).foreach(item=>println(item))
}
fizzBuzzMap("Fizz","Buzz",20)


def reWriteConditional(d:Int,b:Int,c:Boolean): Int = (d, b,c) match {

  case a if(a._1==0 && a._2==0) => 0
  case a if(a._1==0) => b
  case a if(a._2==0) => d
  case a if(a._3==true) => d+b
  case a if(a._3==false) => d*b
  case _ => 0
}

reWriteConditional(5,2,false)


def reOrganniseConditional(input:Any)=input match{

    case item: Array[Int] =>  Array(item(1),item(0))
    case item: List[Any] => List(item(1),item(0))
    case (x,y) =>(y,x)
    case _ =>
}

reOrganniseConditional(Array(1,2,10,23,12,1,1))
reOrganniseConditional(List(1,2))
reOrganniseConditional((1,2))

def functional(): Unit ={
  var array1:Array[String] = java.util.TimeZone.getAvailableIDs().map(a =>a.split('/')).filter(_.length>1).map(a=>a(1)).grouped(50).map(a=>a(0)).toArray
  array1.foreach(println)

}
functional()




// Given 2 integer values greater than 0
def blackjack(a:Int,b:Int): Unit ={
  if(a==21 && b ==21){
    println(21)
  }else if((a>b && a<22)||(b>21 && a<22)){
    println(a)
  }else if((b>a && b<22)||(a>21 && b<22)){
    println(b)
  }else if(a==b && (a<22 && b<22)){
  println("draw")
  }else{
    println("both busted")
}}
blackjack(19,20)

def blackjackImproved(a:Int,b:Int): Unit ={
  var collectionResult = List(a,b,0).filter(_<22).sorted.reverse
  println(collectionResult(0))
}
blackjackImproved(17,21)

def uniqueSum(a:Int,b:Int,c:Int): Unit ={
  var sum = 0
  if((a!=b) && a!=c){
    sum=a+sum
  }
  if((b!=a)&&(b!=c)){
    sum= b+sum
  }
  if((c!=a)&&c!=b){
    sum = c+sum
  }
  println(sum)
}
uniqueSum(1,2,3)
uniqueSum(3,3,3)
uniqueSum(1,1,2)

import scala.collection.mutable.ListBuffer
def uniqueSumNew(a:Array[Int]): Unit ={
  println(a.distinct.sum)
 // var container = new ListBuffer[Int]()
 // a.foreach(item=> if(container.contains(item)){}else{container+=item})
 // container.toList
 // println(container.sum)
}
uniqueSumNew(Array[Int](2,4,4,3))

def tooHot(temperature:Int,summer:Boolean): Boolean ={
  if(summer == false&&(temperature >=60 && temperature <=90)){true}
  else if(summer==true && (temperature <=100&& temperature >= 60)){true}
  else false
}
tooHot(100,true)

