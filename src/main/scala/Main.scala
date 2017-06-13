/**
  * Created by Administrator on 05/06/2017.
  */
object Main {


  def main(args: Array[String]) = {

    var employee1 = new Employee(1,"Billy","Unemployed")
    var employee2 = new Employee(2,"Emp1","Unemployed")
    var employee3 = new Employee(3,"Robin","Unemployed")
    var employee4 = new Employee(4,"CloudMan","Unemployed")

    var customer1 = new Customer(5,"John")
    var customer2 = new Customer(6,"Tony")
    var customer3 = new Customer(7,"Chris")
    var customer4 = new Customer(8,"Batman")

    var ride1 = new Car(1,7,customer1)
    var ride2 = new Car(2,7,customer2)
    var ride3 = new Bike(3,4,customer3)
    var ride4 = new Car(4,7,customer4)
    var ride5 = new Car(5,7,customer2)
    var ride6 = new Car(6,7,customer4)
    var ride7 = new Car(7,7,customer2)
    var ride8 = new Car(8,7,customer1)
    var ride9 = new Car(9,7,customer3)
    var ride10 = new Car(10,7,customer4)
    var ride11 = new Car(11,7,customer1)

    var garage = new Garage()

    garage.registeredEmployees+= (employee1,employee2,employee3,employee4)
    garage.nonBusyEmployees+= (employee1,employee2,employee3,employee4)
    garage.openGarage()
    garage.addVehicle(ride1);garage.addVehicle(ride2);garage.addVehicle(ride3);garage.addVehicle(ride4);garage.addVehicle(ride5);garage.addVehicle(ride6);garage.addVehicle(ride7);garage.addVehicle(ride8);garage.addVehicle(ride9);garage.addVehicle(ride10);garage.addVehicle(ride11)

    garage.startFixing()
   // garage.fixVehicle(ride1,employee1)






  //  println(ride1.vehicleParts.foreach(item=> println(item.broken)))
   // garage.addVehicle(customer1,ride1)
  //  garage.addVehicle(customer2,ride2)

   // garage.fixVehicle(ride1)
    //garage.fixVehicle(ride3)
    //println(garage.getGarageVehicleListBufferContent().size)
  //  garage.getGarageVehicleListBufferContent().toList.foreach(item=> println(item.getVehicleID()))

   // garage.removeVehicleByID(5)
   // garage.getGarageVehicleListBufferContent().toList.foreach(item=> println(item.getVehicleID()))
   // print(user1.getID())
   // garage.outPutContentOfGarage()
  }
}
