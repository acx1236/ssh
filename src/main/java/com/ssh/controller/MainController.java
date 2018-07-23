package com.ssh.controller;

import com.ssh.service.IMainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @Autowired
    private IMainService mainService;

    @ResponseBody
    @RequestMapping(value = "save")
    public String save() {
        mainService.save();
        return "save success";
    }

    @ResponseBody
    @RequestMapping(value = "update")
    public String update() {
        mainService.update();
        return "update success";
    }

    @ResponseBody
    @RequestMapping(value = "main")
    public String main(Integer id, String arg) {
        System.err.println(id);
        System.err.println(arg);
        return "main success";
    }

}