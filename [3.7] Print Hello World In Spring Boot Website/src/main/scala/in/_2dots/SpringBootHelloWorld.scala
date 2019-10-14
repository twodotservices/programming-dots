package in._2dots

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class SpringBootHelloWorld {
}

object SpringBootHelloWorld {
  def main(args: Array[String]): Unit = {
    SpringApplication.run(classOf[SpringBootHelloWorld]);
  }
}