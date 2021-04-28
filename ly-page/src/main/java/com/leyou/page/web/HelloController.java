package com.leyou.page.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author ssqswyf
 * @Date 2021/4/28
 */

@Controller
public class HelloController {

    @GetMapping("hello")
    public String toHello(Model model) {
        model.addAttribute("msg", "hello,thymeleaf!");
        return "hello";
    }
}
