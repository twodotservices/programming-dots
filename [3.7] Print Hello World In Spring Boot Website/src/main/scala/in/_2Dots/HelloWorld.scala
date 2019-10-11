package in._2Dots

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication


@SpringBootApplication
class HelloWorld {}

object HelloWorld {
  def main(args: Array[String]) {
    SpringApplication.run(classOf[HelloWorld])
  }
}