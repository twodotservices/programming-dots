package io._2dots

import java.io.FileInputStream
import java.util.Properties

import org.omg.CORBA.Environment

class PrintPattern {
  def trianglePattern(n: Int): Unit = {
    var space = n - 1
    for (l <- 1 to n) {
      for (h <- 1 to space) {
        print(" ")
      }
      space -= 1
      for (h <- 1 to l * 2 - 1) {
        print("*")
      }
      println("")
    }
  }
}

object PrintPattern {
  def main(args: Array[String]): Unit = {
    val p = new PrintPattern()
    val input = new FileInputStream("src/main/resources/application.properties")
    val prop = new Properties()
    prop.load(input)

    val n = prop.getProperty("pattern.val").toInt
    println("\n................Pattern..................")
    p.trianglePattern(n)
    input.close()
  }
}
