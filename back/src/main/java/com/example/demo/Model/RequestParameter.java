package com.example.demo.Model;


import lombok.Data;

@Data
public class RequestParameter {
    private String chosenDate;
    private String other;
//    查询涨跌家数的天数

    private Integer searchOption;
}
