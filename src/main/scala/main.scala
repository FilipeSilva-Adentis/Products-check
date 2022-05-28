

object main {
  def main(args: Array[String]): Unit = {

    val listOrders = new doOrders().makeOrders()

    var list = new showOrdersInterval(args(0), args(1))

    var intervalList: String = new String()
    try {
      intervalList = args(2)
    } catch {
      case _: Exception =>
    } finally {

    }

    if (intervalList.isEmpty) {
      intervalList = null
      println(new showIntervals(args(0), args(1)).getIntervals(list.getOrders(listOrders)))
    } else {
      println(new showIntervals(args(0), args(1)).getOrdersBySpecInterval(listOrders,intervalList))
    }
  }
}
