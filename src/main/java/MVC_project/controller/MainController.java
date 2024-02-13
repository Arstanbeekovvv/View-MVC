package MVC_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/main")
public class MainController {
    @GetMapping
    public String greetings(){
        return "main-page";
    }
//
//    @GetMapping("/page")
//    public String main(){
//        return "main-page";
//    }



}
