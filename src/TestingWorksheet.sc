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

def sumTwo(a:Int,b:Int,c:Boolean){
  var d: Int = 0
  if(c==true){
  d = a+b

}else if(c ==false){
  d = a*b
}
  print(d)
}
sumTwo(1,2,true)
sumTwo(1,2,false)





