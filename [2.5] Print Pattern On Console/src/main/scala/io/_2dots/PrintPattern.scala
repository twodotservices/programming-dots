package io._2dots

class PrintPattern {
  def trianglePattern(n: Int): Unit = {
    for (l <- 1 to n) {
      for (h <- 1 to l) {
        print(" * ")
      }
      println("")
    }
  }
  def rectanglePattern(n: Int): Unit = {
    for (l <- 1 to n) {
      for (h <- 1 to n) {
        print(" * ")
      }
      println("")
    }
  }
}

object PrintPattern {
  def main(args: Array[String]): Unit = {
    val p = new PrintPattern()
    println("\nEnter number of rows and column value : ")
    val n = scala.io.StdIn.readInt()

    println("\nTriangle Pattern......................")
    p.trianglePattern(n)
    println("\nRectangle Pattern......................")
    p.rectanglePattern(n)
  }
}
