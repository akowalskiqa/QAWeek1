/**
  * Created by Administrator on 09/06/2017.
  */
import scala.collection.mutable.{ListBuffer}
class Garage {

  var openStatus:Boolean = true
  var customerPaymentDue:Map[Int,Int] = Map()
  var listOfCars = ListBuffer[Vehicle]()
  var listOfPeopleInGarage = ListBuffer[Person]()
 // var personToVehicleMapCollection:Map[Person,List[Vehicle]] = Map()
  var registeredEmployees = ListBuffer[Employee]()

  //var personToVehicleMapCollection:Map[Person,Option[Vehicle]] = Map()







//  def addToMapPersonVehicleRelation(addThisPerson:Person,vehicleCollection:List[Vehicle]): Unit ={
//      personToVehicleMapCollection+=(addThisPerson->vehicleCollection)
 // }


 // def addIndividualToGarageCollection(addThisPerson:Person,car:Option[Vehicle]): Unit ={
  //  car match{
 //     case Some(carInput) => personToVehicleMapCollection+= (addThisPerson-> car)
  //    case None => personToVehicleMapCollection+=(addThisPerson-> None)
 //   }
 // }

  def addVehicle(owner:Person,addThis:Vehicle): Unit ={
  //  print(addThis.getVehicleID())
    listOfCars+=addThis
    listOfPeopleInGarage+=owner
  }
  def removeVehicleByID(id:Int): Unit ={
    listOfCars.foreach(item=> if(item.getVehicleID()==id){listOfCars-=item})
  }

  def getGarageVehicleListBufferContent(): ListBuffer[Vehicle] ={
    listOfCars
  }

  def registerEmployee(registerHim:Employee): Unit ={
    registeredEmployees+=registerHim
  }

  def outPutContentOfGarage(): Unit ={
    println("Cars" + listOfCars.foreach(item=> println(item)))
    println("People" + listOfPeopleInGarage.foreach(item=> println(item)))
  }

  def openGarage(): Unit ={
    openStatus= true
  }
  def closeGarage(): Unit ={
    openStatus = false
  }

  def fixVehicle(vehicleToBeFixed:Vehicle): Unit ={
    var amountToPay:Int = 50
  //  if(vehicleToBeFixed.vehicleParts.contains(true)){
      val customerID:Int = vehicleToBeFixed.getVehicleOwner().getID()
      vehicleToBeFixed.vehicleParts.foreach(item => if(item.broken == true){amountToPay+=100;item.broken = false})
      if(customerPaymentDue.contains(customerID)){amountToPay += customerPaymentDue(customerID)}
      customerPaymentDue += (customerID -> amountToPay)
      println(customerID + " needs to pay " + amountToPay+ " " +customerPaymentDue(customerID))
   // }
  }

//  def removeVehicleByType(inputType:String): Unit ={
//    val inputChangeType = Class.forName(inputType)
//    listOfCars.filter(_ ==listOfCars.isInstanceOf[Class[Car]])
//  }
}
