/**
  * Created by Administrator on 06/06/2017.
  */
class Employee extends Person {
  var title:String

  def setTitle(newTitle:String): Unit ={title = newTitle}
  def getTitle(): String ={title}
}
