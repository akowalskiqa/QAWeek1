/**
  * Created by Administrator on 09/06/2017.
  */
import scala.collection.mutable.{ListBuffer}
class Garage {
  var listOfCars = ListBuffer[Vehicle]()
  var listofPeopleInGarage = ListBuffer[Person]()
  //var personToVehicleMapCollection:Map[Person,Option[Vehicle]] = Map()
  var personToVehicleMapCollection:Map[Person,List[Vehicle]] = Map()

  def addToMapPersonVehicleRelation(addThisPerson:Person,vehicleCollection:List[Vehicle]): Unit ={
      personToVehicleMapCollection+=(addThisPerson->vehicleCollection)
  }


 // def addIndividualToGarageCollection(addThisPerson:Person,car:Option[Vehicle]): Unit ={
  //  car match{
 //     case Some(carInput) => personToVehicleMapCollection+= (addThisPerson-> car)
  //    case None => personToVehicleMapCollection+=(addThisPerson-> None)
 //   }
 // }

  def addVehicle(owner:Person,addThis:Vehicle): Unit ={
  //  print(addThis.getVehicleID())
    listOfCars+=addThis
    listofPeopleInGarage+=owner
  }
  def removeVehicle(id:Int): Unit ={
    listOfCars.foreach(item=> if(item.getVehicleID()==id){listOfCars-=item})
  }

  def getGarageVehicleListBufferContent(): ListBuffer[Vehicle] ={
    listOfCars
  }

}
