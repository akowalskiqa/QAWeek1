/**
  * Created by Administrator on 05/06/2017.
  */
object Main {


  def main(args: Array[String]) = {

    var employee1 = new Employee(25,"Billy","Unemployed")
    var employee2 = new Employee(25,"Emp1","Unemployed")
    var employee3 = new Employee(25,"Robin","Unemployed")
    var employee4 = new Employee(25,"CloudMan","Unemployed")

    var customer1 = new Customer(19,"John")
    var customer2 = new Customer(19,"Tony")
    var customer3 = new Customer(19,"Chris")
    var customer4 = new Customer(19,"Batman")

    var ride1 = new Car(1,7,customer1)
    var ride3 = new Car(11231,7,customer2)
    var ride2 = new Bike(5,4,customer3)

    var garage = new Garage()

    garage.registeredEmployees+= (employee1,employee2,employee3,employee4)









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
