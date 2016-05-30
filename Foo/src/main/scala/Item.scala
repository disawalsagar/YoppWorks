import java.util

/**
 * Created by disawalsagar on 5/30/16.
 */
object Item {

  val itemMap:Map[String,Double] = Map("Milk" -> 2.99,"Egg"-> 1.99,"Bread" -> 3.99,"Apple" ->2.99,"Sugar" -> 6.99)



  def showItems() {

    itemMap.foreach{case (item, value) => println(item + "-->" + value) }
  }

  def displayBundle() {

    val bundles = List("Buy1FruitGet1Free","Buy2BreadGetEggFree","BuyMilkBreadGetSugarAtHalf");
    bundles foreach(println(_))
  }

  def getPrice(key: String):Double = itemMap(key)
}
