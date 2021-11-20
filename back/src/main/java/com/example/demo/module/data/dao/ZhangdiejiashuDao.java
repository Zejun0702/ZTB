package com.example.demo.module.data.dao;

import com.example.demo.module.data.entity.Zhangdiejiashu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface ZhangdiejiashuDao {
    int deleteByPrimaryKey(String objid);

    int insert(Zhangdiejiashu record);

    int insertSelective(Zhangdiejiashu record);

    Zhangdiejiashu selectByPrimaryKey(String objid);

    List<Zhangdiejiashu> getLDNum(int searchDays);

    int updateByPrimaryKeySelective(Zhangdiejiashu record);

    int updateByPrimaryKey(Zhangdiejiashu record);
}