package com.example.springsample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorldController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String helloworld(Model model){

        // double fn = Math.random();
        // String rt ;

        // if(fn >= 0.7){
        //     rt = "今日はいい調子だな";
        // }else if(fn >= 0.5){
        //     rt = "気合い入れてくぞ";
        // }else if(fn >= 0.3){
        //     rt = "そんな日もあるよ";
        // }else{
        //     rt = "人生一回だな";
        // }
        // model.addAttribute("message", rt);

        model.addAttribute("message", "Hello World!!");
        
        return "index.html";

    }
    
}
