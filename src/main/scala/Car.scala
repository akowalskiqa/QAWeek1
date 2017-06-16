/**
  * Created by Administrator on 06/06/2017.
  */
class Car(id: Int,seatCount: Int,owner:Person) extends Vehicle(id,seatCount,owner) {
  val numberOfParts:Int = 10+ r.nextInt(30) // easier to process with smaller range
  for(i<-0 to numberOfParts){
    vehicleParts+= new Part()
  }
  override def toString: String = super.toString + (s"this car has $numberOfParts parts")
}
