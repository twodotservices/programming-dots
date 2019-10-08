import java.util.Properties

import scala.io.Source

object Pattern {
  def main(args: Array[String]) {
    var properties: Properties = null
    val propertiesUrl = getClass.getResource("/triangle.properties")
    if (propertiesUrl != null) {
      val sourceFile = Source.fromURL(propertiesUrl)

      properties = new Properties()
      properties.load(sourceFile.bufferedReader())
    }
    val Rows: Int = Integer.parseInt(properties.getProperty("rows"))
    var currentRow: Int = 1
    while (currentRow <= Rows) {
      var space: Int = Rows
      while (space > currentRow) {
        print(" ")
        space -= 1
        space + 1
      }
      var numberOfStar: Int = 1
      while (numberOfStar <= (currentRow * 2) - 1) {
        print("*")
        numberOfStar += 1
        numberOfStar - 1
      }
      println()
      currentRow += 1
      currentRow - 1
    }
  }
}
