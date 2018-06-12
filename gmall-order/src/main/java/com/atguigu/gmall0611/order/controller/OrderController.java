package com.atguigu.gmall0611.order.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @param
 * @return
 */

@Controller
public class OrderController {


    @GetMapping("index")
    @ResponseBody
    public  String index(){
        return "hello order ";
    }
}
