package com.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author zy
 * @create 2021-12-10-22:56
 */

@Controller
public class TableController {

    @GetMapping("/basic_table")
    public String basic_table(){
        return "table/basic_table";
    }


    @GetMapping("/editable_table")
    public String editable_table(){
        return "table/editable_table";
    }


    @GetMapping("/dynamic_table")
    public String dynamic_table(){
        return "table/dynamic_table";
    }


    @GetMapping("/pricing_table")
    public String pricing_table(){
        return "table/pricing_table";
    }

    @GetMapping("/responsive_table")
    public String responsive_table(){
        return "table/responsive_table";
    }
}
