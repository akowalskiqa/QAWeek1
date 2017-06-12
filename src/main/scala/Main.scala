/**
  * Created by Administrator on 05/06/2017.
  */
object Main {


  def main(args: Array[String]) = {

    var user1 = new Employee(25,"John","Unemployed")
    var user2 = new Customer(19,"John")
    var ride1 = new Car(1,7,user2)
    var ride2 = new Bike(5,4,user1)
    var garage = new Garage()


    garage.addVehicle(user1,ride1)
    garage.addVehicle(user2,ride2)

    //println(garage.getGarageVehicleListBufferContent().size)
  //  garage.getGarageVehicleListBufferContent().toList.foreach(item=> println(item.getVehicleID()))

    garage.removeVehicleByID(5)
   // garage.getGarageVehicleListBufferContent().toList.foreach(item=> println(item.getVehicleID()))
   // print(user1.getID())
    garage.outPutContentOfGarage()
  }
}
