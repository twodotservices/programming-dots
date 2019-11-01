package in._2dots

object TossCoin {
  def main(args: Array[String]): Unit = {
    if (Math.random() < 0.5) {
      println("Head")
    }
    else {
      println("Tail")
    }
  }
}
