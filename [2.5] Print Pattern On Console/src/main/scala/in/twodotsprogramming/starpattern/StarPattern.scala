package in.twodotsprogramming.starpattern

import java.util.Properties
import scala.io.Source

object StarPattern {
  def main(args: Array[String]) {
    var properties: Properties = null
    val propertiesUrl = getClass.getResource("/pattern.properties")
    if (propertiesUrl != null) {
      val sourceFile = Source.fromURL(propertiesUrl)

      properties = new Properties()
      properties.load(sourceFile.bufferedReader())
    }

    val totalRows: Int = Integer.parseInt(properties.getProperty("number.of.rows"))
    var currentRow: Int = 1
    while (currentRow <= totalRows) {
      // Print space in decreasing order
      var space: Int = totalRows
      while (space > currentRow) {
        print(" ")
        space -= 1
        space + 1
      }
      // Print star in increasing order
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