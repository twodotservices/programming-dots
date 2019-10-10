package twodots.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HelloWorldController {
  @GetMapping(value = Array("/helloWorld"))
  def hello(model: Model): String = {
    model.addAttribute("helloMessage", "hello world")
    "helloWorld"
  }
}
