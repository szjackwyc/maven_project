package com.jianle.web.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jianle.dal.model.BackstageOperLog;
import com.jianle.service.BackstageOperLogService;

@Controller
public class HelloController {

    @Autowired
    private BackstageOperLogService backstageOperLogService;

    @RequestMapping(value = "/hello")
    public String HelloWorld(Model model) {
        model.addAttribute("message", "HelloWorld");
        return "HelloWorld";
    }

    @ResponseBody
    @RequestMapping(value = "/json")
    public Map<String, Object> getJson() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("key", "value");
        return map;
    }

    @ResponseBody
    @RequestMapping(value = "/list.json")
    public Map<String, Object> getList() {
        List<BackstageOperLog> list = backstageOperLogService.findAll();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("list", list);
        return map;
    }

}
