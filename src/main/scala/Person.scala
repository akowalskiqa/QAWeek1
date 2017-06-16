/**
  * Created by Administrator on 06/06/2017.
  */
abstract class Person(val id:Int, val name:String) {
  def getID():Int={id}
  def getName():String={name}

  override def toString: String = {s"Person details are: id number: $id, name: $name "}
}
