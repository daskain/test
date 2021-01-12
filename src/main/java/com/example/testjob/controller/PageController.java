package com.example.testjob.controller;

import com.example.testjob.model.TestJobModel;
import com.example.testjob.service.TestJobService;
import com.example.testjob.service.WorkOnArrayService;
import com.example.testjob.service.impl.TestJobServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class PageController  {



    @GetMapping
    public String indexPage(Model model) {
        return "index";
    }

    @GetMapping("/generate")
    public String getAllPage(Model model) {
        return "generate";
    }

    @GetMapping("/get_all")
    public String getById(Model model) {
        return "get_all";
    }

}
