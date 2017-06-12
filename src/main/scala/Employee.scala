/**
  * Created by Administrator on 06/06/2017.
  */
class Employee (id:Int,name:String,var title:String) extends Person(id,name) {
  var busy:Boolean = false

  def setTitle(newTitle:String): Unit ={title = newTitle}
  def getTitle(): String ={title}

}
