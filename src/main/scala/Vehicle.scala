/**
  * Created by Administrator on 06/06/2017.
  */
abstract class Vehicle(var vehicleId: Int, var seatCount: Int) {


  def setVehicleID(newIDNumber:Int): Unit ={iD = newIDNumber}
  def setSeatAmount(newSeatAmount:Int): Unit=(seats=newSeatAmount)
  def getVehicleID():Unit={iD}
  def getSeatAmount():Unit={seats}

}
