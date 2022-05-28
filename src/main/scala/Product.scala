import java.text.SimpleDateFormat


class Product(private var name: String,
              private var category: String,
              private var weight: Float,
              private var price: Float,
              private var creationDate: String) {

  try {
    val df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    df.setLenient(false)
    df.parse(creationDate)
  } catch {
    case _: Exception => throw new Exception("\n\nInvalid Date '" + creationDate + "' for product '" + name)
  }

  if (name.isEmpty || name.isBlank || category.isBlank || category.isBlank || weight <= 0 || price <= 0) {
    throw new ArithmeticException("\nWrong  fields input for product '" + name + "'")
  }

  def getPrice(): Float = {
    price
  }

  def getDate(): String = {
    creationDate
  }

  def getName(): String = {
    name
  }

  override def toString: String = "\nProduct:" + "\nName: " + name + "\nCategory:" + category + "\nWeight: " + weight + "\nPrice: " + price + "\nCreation Date: " + creationDate;

  def equals(obj: Product): Boolean = {
    if (this.name.equals(obj.name) && this.category.equals(obj.category) && this.weight.equals(obj.weight) && this.creationDate.equals(obj.creationDate) && this.price.equals(obj.price)) {
      true
    }
    false
  }
}
