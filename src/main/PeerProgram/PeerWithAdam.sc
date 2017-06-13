val r = new scala.util.Random
def testRandom(small:Int,high:Int,current:Int,iterations:Int,guessThis:Int): Unit ={
  if(current==guessThis){println(s"success found $guessThis with $iterations number of guesses")}
  else if(current<guessThis){val random = small+r.nextInt((high-small)+1);if(current>small){println(s"small $small has been changed to $current");testRandom(current,high,random,iterations+1,guessThis)}else {testRandom(small,high,random,iterations+1,guessThis)}}
  else if(current>guessThis){val random = small+r.nextInt((high-small)+1);if(current<high){println(s"high $high has been changed to $current");testRandom(small,current,random,iterations+1,guessThis)}else{testRandom(small,high,random,iterations+1,guessThis)}}
}
testRandom(1,100,50,1,49)