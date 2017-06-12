/**
  * Created by Administrator on 09/06/2017.
  */
import scala.collection.mutable.{ListBuffer}
class Garage {

  var openStatus:Boolean = false
  var customerPaymentDue:Map[Int,Int] = Map()
  var listOfCars = ListBuffer[Vehicle]()
  var listOfPeopleInGarage = ListBuffer[Person]()
  var registeredEmployees = ListBuffer[Employee]() // redundant but left it because of the criteria, perhaps only for printing all the registered employees within garage thats all
  var nonBusyEmployees = ListBuffer[Employee]()


  // var personToVehicleMapCollection:Map[Person,List[Vehicle]] = Map()
  //var personToVehicleMapCollection:Map[Person,Option[Vehicle]] = Map()


def startFixing(): Unit ={
  while(nonBusyEmployees.length>0){



    listOfCars.foreach(car=> if(car.vehicleParts.foreach(part=>if(part.broken==true){}){fixVehicle(car,nonBusyEmployees(0))}))
  }
}

def appointEmployeeToFix(vehicleToBeFixed:Vehicle): Boolean ={
    if(nonBusyEmployees.length>0){
      fixVehicle(vehicleToBeFixed,nonBusyEmployees(0));true
    }
  false
}



//  def addToMapPersonVehicleRelation(addThisPerson:Person,vehicleCollection:List[Vehicle]): Unit ={
//      personToVehicleMapCollection+=(addThisPerson->vehicleCollection)
 // }


 // def addIndividualToGarageCollection(addThisPerson:Person,car:Option[Vehicle]): Unit ={
  //  car match{
 //     case Some(carInput) => personToVehicleMapCollection+= (addThisPerson-> car)
  //    case None => personToVehicleMapCollection+=(addThisPerson-> None)
 //   }
 // }

  def addVehicle(addThis:Vehicle): Unit ={
  //  print(addThis.getVehicleID())
    listOfCars+=addThis
    //listOfPeopleInGarage+=owner
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

  def fixVehicle(vehicleToBeFixed:Vehicle,assignedEmployee:Employee): Unit ={
    var amountToPay:Int = 0
    var howManyPartsAreBroken = 0
    var timeToFix = 0;
      val customerID:Int = vehicleToBeFixed.getVehicleOwner().getID()
      vehicleToBeFixed.vehicleParts.foreach(item => if(item.broken == true){amountToPay+=item.price;howManyPartsAreBroken+=1;timeToFix+=item.timeToFix;item.broken = false})
      println("Employee "+assignedEmployee.getID()+" : "+ assignedEmployee.getName()+" is fixing car ID: "+ vehicleToBeFixed.getVehicleID()+", it will take him "+timeToFix+"s to fix the broken parts")
      assignedEmployee.turnBusy(timeToFix)// its fine to just put him to sleep here
      if(customerPaymentDue.contains(customerID)){amountToPay += customerPaymentDue(customerID)}
      customerPaymentDue += (customerID -> amountToPay)
      println("Customer ID: "+customerID+" needs to pay " +amountToPay+" For "+howManyPartsAreBroken+" being fixed, overall for all car fixes he is due: "+customerPaymentDue(customerID))
  }



//  def removeVehicleByType(inputType:String): Unit ={
//    val inputChangeType = Class.forName(inputType)
//    listOfCars.filter(_ ==listOfCars.isInstanceOf[Class[Car]])
//  }
}
