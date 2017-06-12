/**
  * Created by Administrator on 06/06/2017.
  */
class Car(id: Int,count: Int,owner:Person) extends Vehicle(id,count,owner) {
  val numberOfParts:Int = 10+ r.nextInt(30) // easier to process with smaller range

  setSeatAmount(5)
}
