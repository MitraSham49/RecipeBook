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



    @RequestMapping("/eggsauce")
    public String shownigeria()
    {

        return "eggsauce";
    }
    @RequestMapping("/")
    public String showrecipes()
    {

        return "recipes";
    }

    @RequestMapping("/home")
    public String showhome()
    {

        return "recipes";
    }


    @RequestMapping("/recipebook")
    public String showrecipe()
    {

        return "recipes";
    }
}
