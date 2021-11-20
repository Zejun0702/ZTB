package com.example.demo.Model;

import com.example.demo.module.data.entity.Jinrizhangting;
import com.example.demo.module.data.entity.Zhangdiejiashu;
import lombok.Data;

import java.util.List;


@Data
public class ResultModel {

    private List<Jinrizhangting> jinrizhangtingList;
    private Integer code;
    private List<Zhangdiejiashu> zhangdiejiashuList;
}
