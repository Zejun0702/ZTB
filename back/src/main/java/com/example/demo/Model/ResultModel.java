package com.example.demo.Model;

import com.example.demo.module.data.entity.Jinrizhangting;
import lombok.Data;

import java.util.List;


@Data
public class ResultModel {

    private List<Jinrizhangting> jinrizhangtingList;
    private Integer code;
}
