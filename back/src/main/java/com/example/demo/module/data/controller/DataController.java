package com.example.demo.module.data.controller;

import com.example.demo.Model.RequestParameter;
import com.example.demo.Model.ResultModel;
import com.example.demo.module.data.Service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

    @Autowired
    private DataService dataService;

    @PostMapping("/ztb/data/getData")
    public ResultModel getJinrizhangting(@RequestBody RequestParameter requestParameter){
        System.out.println(requestParameter.getChosenDate());
        ResultModel resultModel = dataService.getJinrizhangting(requestParameter.getChosenDate());
        return resultModel;

//        return "{\"code\":20000,\"data\":{\"token\":\"admin-token\"}}";
    }
}
