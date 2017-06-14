/**
  * Created by Administrator on 09/06/2017.
  */

import com.sun.net.httpserver.Authenticator.Success

import scala.collection.mutable.ListBuffer
import scala.concurrent.Future
import scala.util.{Failure, Success}

class Garage {

  var openStatus: Boolean = false
  var customerPaymentDue: Map[Int, Int] = Map()
  var listOfCars = ListBuffer[Vehicle]()
  var listOfPeopleInGarage = ListBuffer[Person]()
  var registeredEmployees = ListBuffer[Employee]() // redundant but left it because of the criteria, perhaps only for printing all the registered employees within garage thats all
  var nonBusyEmployees = ListBuffer[Employee]() // should in real life only contain available engineers


  // var personToVehicleMapCollection:Map[Person,List[Vehicle]] = Map()
  //var personToVehicleMapCollection:Map[Person,Option[Vehicle]] = Map()

  //should correspond to criteria, if more robust is required should only need minor changes
  def startFixing(): Unit = {
    var timeForAllVehiclesToBeFixed = 0
    listOfCars.foreach(car => car.vehicleParts.foreach(part => timeForAllVehiclesToBeFixed += part.timeToFix))
    println(s"It should take $timeForAllVehiclesToBeFixed ~ for all cars to be fixed")
    fixList()
    var totalIncomeForThisDay = 0
    customerPaymentDue.foreach {
      case (customerId, amountToPay) => totalIncomeForThisDay += amountToPay
      case _ =>
    }
    println(s"Total income for the day is: $totalIncomeForThisDay")
  }

  def fixList(): Unit = {
    while (listOfCars.nonEmpty && nonBusyEmployees.nonEmpty) {
     // println(nonBusyEmployees.length)
      var fixableOrNot = false
      listOfCars.head.vehicleParts.foreach(part => if (part.broken) {
        fixableOrNot=true
      })
      if(fixableOrNot){
        fixVehicle(listOfCars.head, nonBusyEmployees.head)
        nonBusyEmployees -= nonBusyEmployees.head
      }

      listOfCars -= listOfCars.head

    }
    if (listOfCars.nonEmpty) {
      Thread.sleep(3000); fixList()
    }
    Thread.sleep(5000)
  }

////as
  //  def addToMapPersonVehicleRelation(addThisPerson:Person,vehicleCollection:List[Vehicle]): Unit ={
  //      personToVehicleMapCollection+=(addThisPerson->vehicleCollection)
  // }


  // def addIndividualToGarageCollection(addThisPerson:Person,car:Option[Vehicle]): Unit ={
  //  car match{
  //     case Some(carInput) => personToVehicleMapCollection+= (addThisPerson-> car)
  //    case None => personToVehicleMapCollection+=(addThisPerson-> None)
  //   }
  // }

  def addVehicle(addThis: Vehicle): Unit = {
    //  print(addThis.getVehicleID())
    listOfCars += addThis
    //listOfPeopleInGarage+=owner
  }

  def removeVehicleByID(id: Int): Unit = {
    listOfCars.foreach(item => if (item.getVehicleID() == id) {
      listOfCars -= item
    })
  }

  def getGarageVehicleListBufferContent(): ListBuffer[Vehicle] = {
    listOfCars
  }

  def registerEmployee(registerHim: Employee): Unit = {
    registeredEmployees += registerHim
  }

  def outPutContentOfGarage(): Unit = {
    println("Cars" + listOfCars.foreach(item => println(item)))
    println("People" + listOfPeopleInGarage.foreach(item => println(item)))
  }

  def openGarage(): Unit = {
    openStatus = true
  }

  def closeGarage(): Unit = {
    openStatus = false
  }

  import scala.concurrent.Future
  import scala.concurrent.ExecutionContext.Implicits.global
  import scala.util.{Failure, Success}

  def fixVehicle(vehicleToBeFixed: Vehicle, assignedEmployee: Employee): Unit = {
    val f = Future {
      var amountToPay: Int = 0
      var howManyPartsAreBroken = 0
      var timeToFix = 0
      val customerID: Int = vehicleToBeFixed.getVehicleOwner().getID()
      vehicleToBeFixed.vehicleParts.foreach(item => if (item.broken) {
        amountToPay += item.price
        howManyPartsAreBroken += 1
        timeToFix += item.timeToFix
        item.broken = false
      })
      println("Employee " + assignedEmployee.getID() + " : " + assignedEmployee.getName() + " is fixing car ID: " + vehicleToBeFixed.getVehicleID() + ", it will take him " + timeToFix + "s to fix the broken parts")
      assignedEmployee.turnBusy(timeToFix) // its fine to just put him to sleep here
      if (customerPaymentDue.contains(customerID)) {
        amountToPay += customerPaymentDue(customerID)
      }
      customerPaymentDue += (customerID -> amountToPay)
      println(s"Customer ID: $customerID needs to pay  $amountToPay For car id: ${vehicleToBeFixed.getVehicleID()} with $howManyPartsAreBroken parts being fixed. Overall customer ID: $customerID for all car fixes he is due: " + customerPaymentDue(customerID))
      nonBusyEmployees += assignedEmployee
      true
    }
    f.onComplete {
      case Success(true) => println("Fixed")
      case Failure(exception) => println("Broke with " + exception.printStackTrace())
    }
  }



  //  def removeVehicleByType(inputType:String): Unit ={
  //    val inputChangeType = Class.forName(inputType)
  //    listOfCars.filter(_ ==listOfCars.isInstanceOf[Class[Car]])
  //  }
}
