package in.twodots

object Coin {
  def main(args: Array[String]): Unit = {
    println("toss coin")
    if (math.random() > 0.5)
      println("It is HEADS")
    else
      println("It is TAILS")
  }
}
