
import java.util.Properties
import scala.io.Source

object StarPattern {
  def main(args: Array[String]) {
    var properties: Properties = null
    val propertiesUrl = getClass.getResource("/variable.properties")
    if (propertiesUrl != null) {
      val sourceFile = Source.fromURL(propertiesUrl)

      properties = new Properties()
      properties.load(sourceFile.bufferedReader())
    }

    val outerRow: Int = Integer.parseInt(properties.getProperty("no.of.loops"))
    var innerRow: Int = 1
    while (innerRow <= outerRow) {

      var space: Int = outerRow
      while (space > innerRow) {
        print(" ")
        space -= 1
        space + 1
      }
      var printStar: Int = 1
      while (printStar <= (innerRow * 2) - 1) {
        print("*")
        printStar += 1
        printStar - 1
      }
      println()
      innerRow += 1
      innerRow - 1
    }
  }
}
