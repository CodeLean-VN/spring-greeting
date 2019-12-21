package codelean.controllers;


import codelean.model.Account;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
public class GreetingController{

    @RequestMapping(value = "/greetingwithpathvariable/{name}", method = GET)
    public String greeting(@PathVariable String name, Model model){
        model.addAttribute("name", name);
        return "index";
    }

    @RequestMapping(value = "/greetingwithmultipathvariable/name/{name}/email/{email}", method = GET)
    public String greeting(@PathVariable String name,@PathVariable String email, Model model){
        model.addAttribute("name", name);
        model.addAttribute("email", email);
        return "index";
    }

    @GetMapping("/greetingaccount")
    public ModelAndView greetingAccount(){
        Account account = new Account("van@codelean.vn", "Ha Van");

        ModelAndView modelAndView = new ModelAndView("success", "user", account);
        modelAndView.addObject("message", "Dang ky thanh cong");
        return modelAndView;
    }

    @RequestMapping(value = "greetingwithparam", method = GET, params = "name")
    public String greetingString(@RequestParam String name, Model model){
        model.addAttribute("name", name);
        return "index";
    }

    @RequestMapping(value = "greeting", method = RequestMethod.POST)
    public String greeting() {
        return "index";
    }
}