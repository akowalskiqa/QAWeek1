/**
  * Created by Administrator on 06/06/2017.
  */
class Employee (id:Int,name:String,var title:String) extends Person(id,name) {
  def setTitle(newTitle:String): Unit ={title = newTitle}
  def getTitle(): String ={title}

  override def toString: String = super.toString + (s"title: $title")

  def turnBusy(busyDuration:Int): Unit ={
    Thread.sleep(busyDuration)
  }
}
