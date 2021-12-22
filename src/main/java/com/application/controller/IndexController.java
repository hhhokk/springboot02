package com.application.controller;

import com.application.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;


/**
 * @author zy
 * @create 2021-12-10-20:46
 */

@Controller
public class IndexController {

    @RequestMapping({"/", "login"})
    public String gotoIndex(){
        return "login";
    }

    @PostMapping("/login")
    public String main(User user, HttpSession session,Model model){
        if("123456".equals(user.getUsername()) && "123456".equals(user.getPassword())){
            session.setAttribute("loginUser",user);
            //登陆成功重定向到main
            return "redirect:/main.html";
        }else{
            model.addAttribute("msg","账号密码错误");
            return "login";
        }


    }

    @GetMapping("/main.html")
    public String mainPage(HttpSession session,Model model){
        Object loginUser = session.getAttribute("loginUser");
        if (loginUser != null ){
            return "main";
        }else{
            model.addAttribute("msg","请重新登陆");
            return "login";
        }

    }
}
