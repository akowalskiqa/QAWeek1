/**
  * Created by Administrator on 06/06/2017.
  */
abstract class Vehicle(var vehicleId: Int, var seatCount: Int) {


  def setVehicleID(newIDNumber:Int): Unit ={vehicleId = newIDNumber}
  def setSeatAmount(newSeatAmount:Int): Unit=(seatCount=newSeatAmount)
  def getVehicleID():Int={vehicleId}
  def getSeatAmount():Int={vehicleId}

}
