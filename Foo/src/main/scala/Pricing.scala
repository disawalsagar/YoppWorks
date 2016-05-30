import java.util

/**
 * Created by disawalsagar on 5/30/16.
 */

object Pricing {

  var cost= 0.0

  def cost(cart: List[String]): Double = {
    for (x <- cart) {
      cost = cost + Item.getPrice(x)
    }
    cost = cost - discount(cart)
    cost
  }

  def discount(cart: List[String]): Double = {
    val buy1FruitGet1Free = List("Apple", "Apple")
    val buyMilkBreadGetSugarAtHalf = List("Bread", "Milk", "Egg")
    val buy2BreadGetEggFree = List("Bread", "Bread", "Egg")
    var disc =0.0
    if (buy1FruitGet1Free forall (cart contains)) {
      disc = disc + Item.getPrice("Apple")
    }
    if (buy2BreadGetEggFree forall (cart contains)) {
      disc = disc +  (0.5 * Item.getPrice("Sugar"))
    }
    if (buyMilkBreadGetSugarAtHalf forall (cart contains)) {
      disc = disc + Item.getPrice("Egg")
    }
    disc
  }
}
