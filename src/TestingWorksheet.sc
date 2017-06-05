def printThis(): String ={
  return("hello ");
}

def printThisTest(){
  print(printThis());
}

printThisTest()

def checkThis(name:Any){
  println(name);
}

checkThis(1.2312);

def twoParameters(test:String,number:Int) ={

  var a: String = test.substring(test.size-number,test.size);
  println(a);
}
twoParameters("Hello",3);

def fourParameters(a:String,b:String,c:Char,d:Char): String ={
  var ab:String = a+b;

}
