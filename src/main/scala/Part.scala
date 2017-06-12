/**
  * Created by Administrator on 12/06/2017.
  */
class Part {
  var broken:Boolean = math.random < 0.15 // 0.15% probability of true
  val r: scala.util.Random = scala.util.Random
  var timeToFix:Int = if(broken == true){r.nextInt(120)}else{0}
  val price:Int = r.nextInt(250)
}
