import scala.collection.mutable.ArrayBuffer

class doOrders() {

  def makeOrders(): ArrayBuffer[Order] = {

    val product: Product = new Product("Rtx 3050", "PC", 0.5f, 599.99f, "2021-01-01 00:00:01")
    val item: Item = new Item(12.2f, 5.5f, product)

    val product2: Product = new Product("Samsung x", "Components", 2.55f, 29.99f, "2021-06-02 10:54:10")
    val item2: Item = new Item(10.2f, 51.5f, product2)

    val product3: Product = new Product("Corsair Y", "Keyboard", 1.55f, 199.99f, "2022-04-02 22:34:22")
    val item3: Item = new Item(10.2f, 51.5f, product3)

    val product4: Product = new Product("Dell XPS", "Laptop", 2.55f, 599.99f, "2022-12-02 22:34:22")
    val item4: Item = new Item(20.99f, 23.5f, product4)

    val order1 = new Order("John", 123456789, "blabla - porto - 4000", "2021-01-01 10:01:10", List(item))
    val order2 = new Order("Liam", 123456789, "blabla - porto - 4000", "2021-07-01 03:30:20", List(item2))
    val order3 = new Order("Oliver", 123456789, "blabla - porto - 4000", "2021-07-01 05:50:50", List(item, item2))
    val order4 = new Order("Henry", 123456789, "blabla - porto - 4000", "2021-10-01 10:00:00", List(item, item2))
    val order5 = new Order("James", 123456789, "blabla - porto - 4000", "2022-04-01 16:00:00", List(item2, item))
    val order6 = new Order("Elijah", 123456789, "blabla - porto - 4000", "2022-04-03 11:00:00", List(item, item3))
    val order7 = new Order("Noah", 123456789, "blabla - porto - 4000", "2022-06-01 04:40:40", List(item3))
    val order8 = new Order("William", 123456789, "blabla - porto - 4000", "2022-06-01 20:00:00", List(item2, item3))
    val order9 = new Order("Filipe", 123456789, "blabla - porto - 4000", "2022-07-01 00:00:00", List(item, item2, item3))
    val order10 = new Order("Benjamin", 123456789, "blabla - porto - 4000", "2022-07-01 18:00:00", List(item3, item2))
    val order11 = new Order("Lucas", 123456789, "blabla - porto - 4000", "2022-08-01 00:00:00", List(item3, item))
    val order12 = new Order("Theodore", 123456789, "blabla - porto - 4000", "2023-07-01 00:00:00", List(item4))

    ArrayBuffer(order1, order2, order3, order4, order5, order6, order7, order8, order9, order10, order11, order12)
  }
}
