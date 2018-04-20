package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class MainController {
     @RequestMapping("/crabbypage")
    public String Showusa(){
        return "crabbypage";
    }

    @RequestMapping("/injera")
    public String showethiopia()
    {

        return "injera";
    }
    @RequestMapping("/chickenwings")
    public String showchina()
    {

        return "chickenwings";
    }
    @RequestMapping("/recipes")
    public String showrecipes()
    {

        return "recipes";
    }


}
