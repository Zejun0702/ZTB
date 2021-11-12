package com.example.demo.service;


import com.example.demo.Mybatis.Entity.MRZDQS;
import com.example.demo.Mybatis.Repository.MRZDQSRep;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class Ser {

	@Autowired
	private MRZDQSRep mrzdqsRep;



	public int sum(int a){
		return a+1;
	}

	public List<MRZDQS> select(String rp_time){
		log.info("开始查询");
		List<MRZDQS> mrzdqs =mrzdqsRep.queryByID(rp_time);
		System.out.println(mrzdqs.get(0));
		return mrzdqs;

	}
}
