import com.sun.xml.internal.ws.api.server.AbstractServerAsyncTransport

/**
  * Created by Administrator on 06/06/2017.
  */
class Bike(id: Int,count: Int,owner:Person) extends Vehicle(id ,count,owner ) {
  val numberOfParts:Int = 2+ r.nextInt(15) // easier to process with smaller range
  setSeatAmount(2)
}
