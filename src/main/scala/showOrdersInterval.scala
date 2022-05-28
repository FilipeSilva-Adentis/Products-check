import java.util.Date
import scala.collection.mutable.ArrayBuffer

class showOrdersInterval(private var dateIni: String, private var dateEnd: String) {

  def getOrders(listOrders: ArrayBuffer[Order]): ArrayBuffer[Order] = {

    val list = scala.collection.mutable.ArrayBuffer.empty[Order]

    var dateI = new Date()
    var dateE = new Date()

    val format = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    format.format(new java.util.Date())

    dateI = format.parse(dateIni)
    dateE = format.parse(dateEnd)

    if (dateI.compareTo(dateE) > 0) {
      var dateAux: Date = new Date()
      dateAux = dateI.clone().asInstanceOf[Date]
      dateI = dateE
      dateE = dateAux
    }

    listOrders.foreach(order => {
      if (order.getDate().compareTo(dateI) >= 0 && order.getDate().compareTo(dateE) <= 0) {
        list.addOne(order)
      }
    })

    list
  }
}
