package cst438;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Hello
{
   
   @GetMapping("/hello")
   public String hello(@RequestParam("name") String name, Model model) {
      model.addAttribute("name", name);
      model.addAttribute("time", new java.util.Date().toString());
      return "index";
   }
}
