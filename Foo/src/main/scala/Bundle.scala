import java.util


object Bundle {

  def main(args: Array[String]) {
    println("\n********ITEMS*********")
    Item.showItems()
    println("\n********Current Promotions*********")
    Item.displayBundle()
    val test = List ("Bread", "Bread", "Egg", "Apple", "Apple")
    println("\n******Total::: " + Pricing.cost(test))
  }
}
