package com.example.springmvcp4;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

//@RestController //it will return only string
@Controller //it returns view i.e html page data
public class MyController {
    //@RequestMapping
//    public String display(Model mod){
//     mod.addAttribute("msg","This is Model object Data");
//        return "HTMLPage1";
//    }
//
//    public String display(ModelMap mod){
//        mod.addAttribute("msg","This is Model object Data");
//        return "HTMLPage1";
//    }
    @RequestMapping
//    public String display1(Map<String,Object> mod){
//        mod.put("msg","This is Model object Data");
//        return "HTMLPage1";
//    }

    public ModelAndView display2(){
        ModelAndView mod=new ModelAndView("HTMLPage1");
        mod.addObject("msg","This is Model object Data");
        return mod;
    }

}
