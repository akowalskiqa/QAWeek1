/**
  * Created by Administrator on 06/06/2017.
  */
import scala.collection.mutable.{ListBuffer}
abstract class Vehicle(val vehicleId: Int, var seatCount: Int,owner:Person) {
  val r: scala.util.Random = scala.util.Random
  var vehicleParts = ListBuffer[Part]()

  def getVehicleOwner(): Person ={owner}
  def setSeatAmount(newSeatAmount:Int): Unit=(seatCount=newSeatAmount)
  def getVehicleID():Int={vehicleId}
  def getSeatAmount():Int={vehicleId}

  override def toString: String = {s"Person details are: id number: $vehicleId, name: $seatCount, vehicle owner: $owner "}

}
