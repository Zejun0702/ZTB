package com.example.demo.module.data.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * jinrizhangting
 * @author 
 */
@Data
//@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+2")
public class Jinrizhangting implements Serializable {
    private String objid;

    private Date rpTime;

    private String stockcode;

    private String stockname;

    /**
     * 涨跌幅
     */
    private Double changePercent;

    private Double price;

    /**
     * 封单比
     */
    private Double buyLockVolumeRatio;

    /**
     * 换手率
     */
    private Double turnoverRatio;

    /**
     * 流通市值
     */
    private Double nonRestrictedCapital;

    /**
     * 总市值
     */
    private Double totalCapital;

    /**
     * 首次封板
     */
    private Date firstLimitUp;

    /**
     * 最后封板
     */
    private Date lastLimitUp;

    /**
     * 连版天数
     */
    private Integer limitUpDays;

    /**
     * 当天开板次数
     */
    private Integer breakLimitUpTimes;

    /**
     * 涨停原因
     */
    private String stockReason;

    /**
     * 所属板块
     */
    private String plateName;

    /**
     * 板块ID
     */
    private String plateId;

    /**
     * n天n板中的天数
     */
    private Integer mDaysNBoardsDays;

    /**
     * n天n板中的板数
     */
    private Integer mDaysNBoardsBoards;

    private String plateName2;

    private static final long serialVersionUID = 1L;
}