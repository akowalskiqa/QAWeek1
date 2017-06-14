import scala.collection.mutable.ListBuffer
class Driver(var currentPosition:Int, val gossip:String,val route: List[Int]){
  currentPosition = route(0)
  def changePosition(): Unit ={
    currentPosition = route(currentPosition+1)
  }
  def updateStation(me:Driver,station:CentralStation,busStopNumber:Int){
    station.updateBusStop(busStopNumber,me,2)
  }
  def getCurrentPosition(): Int ={
    currentPosition
  }
}
class CentralStation(){
  var busStop1 = new ListBuffer[Driver]()
  var busStop2 = new ListBuffer[Driver]()
  var busStop3 = new ListBuffer[Driver]()
  var busStop4 = new ListBuffer[Driver]()
  var busStop5 = new ListBuffer[Driver]()

  def updateBusStop(busStopIndex:Int, driverPosting:Driver,departingBusStopIndex:Int): Unit = {


  }
}
def busDriver(driversList:List[Driver]): Unit ={
  var station = new CentralStation()

  while(true){
    //driverList.foreach(item=>item.spreadGossip())
    driversList.foreach(item=> item.updateStation(item,station,item.getCurrentPosition()))//also make it to send following index the bus driver will be going to, and update list for that bus stop
  }
}
def startMethod(): Unit ={
  var driver1 = new Driver(0,"John's Gossip",List[Int](3,1,2,3,5))
  var driver2 = new Driver(0,"Billy's Gossip",List[Int](3, 2, 3, 1))
  var driver3 = new Driver(0,"James's Gossip",List[Int](4, 2, 3 ,4, 5))
  val busDriverList = List[Driver](driver1,driver2,driver3)
  busDriver(busDriverList)
}​