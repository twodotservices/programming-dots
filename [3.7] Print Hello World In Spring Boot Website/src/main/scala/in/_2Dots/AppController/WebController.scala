package in._2Dots.AppController

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class WebController {

  @GetMapping(value=Array("/helloworld"))
  def getHelloWorld(model: Model){
    model.addAttribute("helloMessage", "Hello World")
    "helloWorld"
  }
}