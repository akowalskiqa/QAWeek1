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

def fizzBuzz(a:String,b:String,c:Int):String ={
  for(i<- 0 until c){
    if((i%3)==0 && (i%5)==0){
      a+b
    }
    else if((i%3)==0){
      a
    }else if((i%5)==0){
      b}
  }
}
fizzBuzz("Fizz","Buzz",15)







