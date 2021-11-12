package com.example.demo.Mybatis.Repository;

import com.example.demo.Mybatis.Entity.MRZDQS;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository

public interface MRZDQSRep {
	List<MRZDQS> queryByID(@Param("time") String rp_time);

}
