/**
  * Created by Administrator on 09/06/2017.
  */

import scala.collection.mutable.ListBuffer
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success}

class Garage {
  var openStatus: Boolean = false // garage open or closed
  var customerPaymentDue: Map[Int, Int] = Map() // map of each customer id to pay for total repairs for any amount of vehicles they had to repair
  var listOfCars = ListBuffer[Vehicle]()  // vehicles in garage
  var listOfPeopleInGarage = ListBuffer[Person]() // list of people in garage
  var registeredEmployees = ListBuffer[Employee]() // redundant but left it because of the criteria, perhaps only for printing all the registered employees within garage thats all
  var nonBusyEmployees = ListBuffer[Employee]() // should in real life only contain available engineers

  def addVehicle(addThis: Vehicle): Unit = {
    listOfCars += addThis
    listOfPeopleInGarage += addThis.getVehicleOwner()
  }

  def removeVehicleByID(id: Int): Unit = {listOfCars.foreach(item => if (item.getVehicleID() == id){
      listOfCars -= item})
  }

  def removeVehiclesByType(inputType:String): Unit ={
    inputType.toLowerCase.trim
    inputType match{
      case "car" => listOfCars = listOfCars.filterNot(vehicle =>  vehicle.isInstanceOf[Car])
      case "bike" => listOfCars = listOfCars.filterNot(vehicle =>  vehicle.isInstanceOf[Bike])
      case _ => println("So far there are only two types you can remove: car or bike")
    }
  }

//  def removeVehiclesByType4(inputType:String): Unit ={
  //  listOfCars=listOfCars.filterNot(vehicle=>vehicle.isInstanceOf['inputType'])
 // }

  //def removeVehiclesByType3[T](inputType: ClassTag[T]): Unit ={
   // inputType match{
   //   case item => listOfCars = listOfCars.filterNot(vehicle =>  vehicle.isInstanceOf[Class[T]])
  //  }
 // }

//  def removeVehiclesByType2[T](inputType:T): Unit ={
//    inputType match{
//      case vehicle: T => listOfCars = listOfCars.filterNot(vehicle =>  vehicle.isInstanceOf[T])
//      case _ => println("So far there are only two types you can remove: car or bike")
//    }
//  }

  //  def removeVehicleByType(inputType:String): Unit ={
  //    val inputChangeType = Class.forName(inputType)
  //    listOfCars.filter(_ ==listOfCars.isInstanceOf[Class[Car]])
  //  }

  def getGarageVehicleListBufferContent(): ListBuffer[Vehicle] = {listOfCars}

  def registerEmployee(registerHim: Employee): Unit = {registeredEmployees += registerHim}

  def outPutContentOfGarage(): Unit = {
    println("Vehicles" + listOfCars.foreach(item => println("vehicle "+ item.vehicleId)))
    println("People " + listOfPeopleInGarage.foreach(item => println(item.name)))
    println("Employees" + registeredEmployees.foreach(item =>println("Employee id "+item.id)))
  }

  def openGarage(): Unit = {openStatus = true}

  def closeGarage(): Unit = {openStatus = false
    var totalIncomeForThisDay = 0
    customerPaymentDue.foreach {
      case (customerId, amountToPay) => totalIncomeForThisDay += amountToPay
      case _ =>
    }
    println(s"Total income for the day is: $totalIncomeForThisDay")}

  //should correspond to criteria, if more robust is required should only need minor changes
  def startFixing(): Unit = {
    if (openStatus) {
      var timeForAllVehiclesToBeFixed = 0
      listOfCars.foreach(car => car.vehicleParts.foreach(part => timeForAllVehiclesToBeFixed += part.timeToFix))
      println(s"It should take $timeForAllVehiclesToBeFixed ~ for all cars to be fixed")
      fixList()
    } else {
      println("Garage is actually closed, open the garage to start fixing")
    }
  }

  private def fixList(): Unit = {
    while (listOfCars.nonEmpty && nonBusyEmployees.nonEmpty) {
      // println(nonBusyEmployees.length)
      var fixableOrNot = false
      listOfCars.head.vehicleParts.foreach(part => if (part.broken) {
        fixableOrNot = true
      })
      if (fixableOrNot) {
        fixVehicle(listOfCars.head, nonBusyEmployees.head)
        nonBusyEmployees -= nonBusyEmployees.head
      }
      listOfCars -= listOfCars.head
    }
    if(listOfCars.nonEmpty){
      Thread.sleep(3000)
      fixList()}
    Thread.sleep(5000)
  }

  private def fixVehicle(vehicleToBeFixed: Vehicle, assignedEmployee: Employee): Unit = {
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
      assignedEmployee.turnBusy(timeToFix)
      if (customerPaymentDue.contains(customerID)) {amountToPay += customerPaymentDue(customerID)      }
      customerPaymentDue += (customerID -> amountToPay)
      println(s"Customer ID: $customerID needs to pay  $amountToPay For car id: ${vehicleToBeFixed.getVehicleID()} with $howManyPartsAreBroken parts being fixed. Overall customer ID: $customerID for all car fixes he is due: " + customerPaymentDue(customerID))
      nonBusyEmployees += assignedEmployee
      true // return true to the future
    }
    f.onComplete {
      case Success(true) => println(s"Vehicle ${vehicleToBeFixed.vehicleId} Fixed")
      case Failure(exception) => listOfCars+=vehicleToBeFixed
        println(s"${vehicleToBeFixed.vehicleId} repair broke with " + exception.printStackTrace())
    }
  }
}
