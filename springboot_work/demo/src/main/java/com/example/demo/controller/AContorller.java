package com.example.demo.controller;

import com.example.demo.myclass.AA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AContorller {

    @Autowired
    AA aa3;

    @Autowired
    AA aa4;

    @GetMapping("aa")
    public String aa(){
        AA aa1 = new AA();
        AA aa2 = new AA();
        System.out.println("aa1 = "+aa1);
        System.out.println("aa2 = "+aa2);

        System.out.println("aa1.a = "+aa1.a);
        System.out.println("aa2.a = "+aa2.a);

        aa1.a = 20;

        System.out.println("aa1.a = "+aa1.a);
        System.out.println("aa2.a = "+aa2.a);

        System.out.println("aa3 = "+aa3);
        System.out.println("aa4 = "+aa4);

        aa3.a = 40;

        System.out.println("aa3.a = "+aa3.a);
        System.out.println("aa4.a = "+aa4.a);

        System.out.println("aa");

        return "qweqweqwe";
    }

    @GetMapping("bb")
    public String bb(){
        return "bb";
    }

}
