package com.example.springmvcp5;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
//parent url
//@RequestMapping("/stud") //parent request mapping it is common for all methods
public class MyController {
//    @RequestMapping("/home")
//    public String display1(){ //normal mapping
//        return "Form1";
//    }

//    @RequestMapping("/name")
//    public String display2(){
//        return "Form2";
//    }

    @RequestMapping("/home")
    public String displayForm(){ //it will display form1
        return "Form1";
    }

    @RequestMapping("/success")
    //it will display data on url

 //public String collectData(@RequestParam("username") String name , @RequestParam("pass") String password, Model mod){
    //in case we do not give name in html text field ,it will give defaultname by using @RequestParam default value
   // public String collectData(@RequestParam(defaultValue = "defaultname",name = "username") String name , @RequestParam("pass") String password, Model mod){

//        Login obj=new Login();
//        obj.setUsername(name);
//        obj.setPass(password);
//        mod.addAttribute("loginobj",obj);

//        mod.addAttribute("name1",name); //without login object
//        mod.addAttribute("pass1",password);



 //if we have more than 2 fields in html form then more than 2 @requestparam are used ,then the program is very large.
 //to avoid that we use @modelattribute
    public String collectData(@ModelAttribute("loginobj") Login obj){

        return "Form2";
    }
}
