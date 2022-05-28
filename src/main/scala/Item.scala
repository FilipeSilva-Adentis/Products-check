import java.util.Date

class Item(
            private var shippingFee: Float,
            private var taxAmount: Float,
            private var product: Product) {

  private val cost: Float = BigDecimal(product.getPrice() + (product.getPrice() * (taxAmount / 100)) + shippingFee).setScale(2, BigDecimal.RoundingMode.HALF_UP).toFloat

  if(shippingFee < 0 || taxAmount < 0 ){
    throw new ArithmeticException("\n\nError with product with item \""+ product.getName() + "\"\nThe value of " + (if(shippingFee < 0) "Shipping fee: '" + shippingFee else "Tax amount: '" + taxAmount) + "' must be equal or greater than 0")
  }
  def getCost(): Float = {
    cost
  }

  def getDate(): Date = {
    val format = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    format.format(new java.util.Date())

    format.parse(product.getDate())
  }

  def getProduct(): Product = {
    product
  }

  override def toString: String = "\n\n\nItem:\n" + "Cost: " + cost + "\nShipping fee: " + shippingFee + "\nTax amount: " + taxAmount + "\n" + product
}
