package main.Controllers

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class MainController {
  @GetMapping(value = Array("/message"))
  def msgToPage(model: Model): String = {
    model.addAttribute("message", "Hello World")
    "hello"
  }
}