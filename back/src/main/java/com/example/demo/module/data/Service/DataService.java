package com.example.demo.module.data.Service;

import com.example.demo.Model.ResultModel;
import com.example.demo.module.data.dao.JinrizhangtingDao;
import com.example.demo.module.data.entity.Jinrizhangting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataService {

    @Autowired
    private JinrizhangtingDao jinrizhangtingDao;

    public ResultModel getJinrizhangting(String chosenDate){
        ResultModel resultModel = new ResultModel();
        List<Jinrizhangting> jinrizhangtingList =  jinrizhangtingDao.selectByDate(chosenDate);
        resultModel.setJinrizhangtingList(jinrizhangtingList);
        resultModel.setCode(200);
        return resultModel;

    }


}
