package twodots

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class SpringBootHello {

}

object SpringBootHello {
  def main(args: Array[String]): Unit = {
    SpringApplication.run(classOf[SpringBootHello])
  }
}
