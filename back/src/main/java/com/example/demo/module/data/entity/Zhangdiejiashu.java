package com.example.demo.module.data.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * zhangdiejiashu
 * @author 
 */
@Data
public class Zhangdiejiashu implements Serializable {
    private String objid;

    private Date rpTime;

    /**
     * 下跌数
     */
    private Integer fallCount;

    /**
     * 上涨数
     */
    private Integer riseCount;

    /**
     * 涨停数
     */
    private Integer limitUpCount;

    /**
     * 跌停数
     */
    private Integer limitDownCount;

    /**
     * 炸板率
     */
    private Double limitUpBrokenRatio;

    /**
     * 炸板数
     */
    private Integer limitUpBrokenCount;

    private Date lastCheckTime2;

    private Date lastCheckTime3;

    /**
     * 最后检查时间，一般为交易日的下午三点
     */
    private Date lastCheckTime1;

    private static final long serialVersionUID = 1L;
}