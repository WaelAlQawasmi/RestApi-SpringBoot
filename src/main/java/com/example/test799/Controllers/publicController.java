package com.example.test799.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

@Controller
public class publicController {
    ArrayList<String>Companies=new ArrayList<String>();

    @ResponseBody
    @GetMapping("/")
    public HashMap<String, String> welcome(@PathVariable("name")  String name){
        ArrayList<String>data=new ArrayList<String>();
        HashMap<String,String> Dat=new HashMap<String, String>();
        Dat.put(name.toUpperCase(Locale.ROOT),"end");
        data.add("hi");
        data.add("by");
        return Dat;
    }


    @ResponseBody
    @GetMapping("/home")
    public List <Student> data(){
        List <Student> stu= new ArrayList<Student>();
        Student student=new Student("wael","3rd",78809906);
        Student student2=new Student("ahmad","6ed",795755896);
        stu.add(student);
        stu.add(student2);
        return stu;
    }


    @ResponseBody
    @PostMapping("/add/company")
    public RedirectView addCompany(@RequestParam String companyName){
        this.Companies.add(companyName);

          return new RedirectView("/all/companies");
    }
}
