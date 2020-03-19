package com.hlc.boot.helloword.helloword;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class IndexController {
  @RequestMapping("/index")
  @ResponseBody
  public String index() {
   return "你好！我是JAVA演示！";
  }
}