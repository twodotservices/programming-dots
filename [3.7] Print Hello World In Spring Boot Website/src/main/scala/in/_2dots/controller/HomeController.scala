package in._2dots.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.{GetMapping, RequestMapping, ResponseBody, RestController}

@Controller
class HomeController {
  @GetMapping(value = Array("/hello"))
  def helloWorld(model:Model): String ={
    model.addAttribute("message", "Hello World")
    "hello"
  }
}
