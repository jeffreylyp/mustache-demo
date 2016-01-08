package com.yongpoliu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class MustacheController {

  @RequestMapping("/con")
  public String demo(Map<String, Object> model) {
    model.put("name", "Mustache 你好");
    return "demo";
  }
}
