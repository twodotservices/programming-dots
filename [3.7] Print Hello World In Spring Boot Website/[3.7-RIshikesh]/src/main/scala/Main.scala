package main;

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class Main {
}
object SpringBootHello {
  def main(args: Array[String]): Unit = {
    SpringApplication.run(classOf[Main])
  }
}