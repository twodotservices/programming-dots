object CoinToss {

  def main(args: Array[String]) = {
    if (Math.random < 0.5) println("Heads")
    else println("Tails")
  }
}