package com.example.demo.module.data.dao;

import com.example.demo.module.data.entity.Jinrizhangting;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface JinrizhangtingDao {
    int deleteByPrimaryKey(String objid);

    int insert(Jinrizhangting record);

    int insertSelective(Jinrizhangting record);

    List<Jinrizhangting> selectByDate(String date);

    int updateByPrimaryKeySelective(Jinrizhangting record);

    int updateByPrimaryKey(Jinrizhangting record);
}