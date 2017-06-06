/**
  * Created by Administrator on 06/06/2017.
  */
abstract class Person {
  var iD: Any =""

  def setID(newID:Any): Unit ={iD = newID}
  def getID():Any={iD}
}
