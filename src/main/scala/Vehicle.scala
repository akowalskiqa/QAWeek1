/**
  * Created by Administrator on 06/06/2017.
  */
import scala.collection.mutable.{ListBuffer}
abstract class Vehicle(var vehicleId: Int, var seatCount: Int,owner:Person) {
  val r: scala.util.Random = scala.util.Random
  var vehicleParts = ListBuffer[Part]()

  def getVehicleOwner(): Person ={owner}
  def setVehicleID(newIDNumber:Int): Unit ={vehicleId = newIDNumber}
  def setSeatAmount(newSeatAmount:Int): Unit=(seatCount=newSeatAmount)
  def getVehicleID():Int={vehicleId}
  def getSeatAmount():Int={vehicleId}

}
