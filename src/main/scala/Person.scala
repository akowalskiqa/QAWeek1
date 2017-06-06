/**
  * Created by Administrator on 06/06/2017.
  */
abstract class Person {
  var ID: Any

  def setID(newName:Any): Unit ={ID = newName}
  def getID():Any={ID}
}
