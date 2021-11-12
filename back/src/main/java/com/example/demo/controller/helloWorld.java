package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.Model.Person;
import com.example.demo.Mybatis.Entity.MRZDQS;
import com.example.demo.service.Ser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController

public class helloWorld {


	@Autowired
	private Ser ser;

	private String add;
	@Autowired
	private Environment environment;


	@Autowired
	private Person person;

	@Autowired
	private RestTemplate restTemplate;

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}


	@RequestMapping(value = "/hello",method = RequestMethod.GET)
	public int hello(@RequestParam String time){
		List<MRZDQS> res = ser.select(time);
		System.out.println(res.get(0));
		return 2;
	}

	@PostMapping("/vue-element-admin/user/login")
	public String login(@RequestParam(required=false) String username, @RequestParam(required=false) String password){

		return "{\"code\":200,\"data\":{\"token\":\"admin-token\"}}";
	}

	@PostMapping("/vue-element-admin/user/logout")
	public String logout(@RequestParam(required=false) String username, @RequestParam(required=false) String password){
		return "{\"code\":20000,\"data\":\"success\"}";
	}

	@RequestMapping(value = "/vue-element-admin/user/info",method= RequestMethod.GET)
	public String token(@RequestParam(required=false) String role){
		return "{\"code\":200,\"data\":{\"roles\":[\"admin\"],\"introduction\":\"I am a super administrator\",\"avatar\":\"https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif\",\"name\":\"Super Admin\"}}";
	}

	@RequestMapping(value = "/vue-element-admin/transaction/list",method= RequestMethod.GET)
	public String list(@RequestParam(required=false) String role){
		return "{\"code\":200,\"data\":{\"total\":20,\"items\":[{\"order_no\":\"FE9AB3fb-F3dD-0dB4-48C9-c2d5fBAB6be9\",\"timestamp\":1612188825226,\"username\":\"Elizabeth Martinez\",\"price\":7479.6,\"status\":\"pending\"},{\"order_no\":\"2d74dc3B-a3d9-780d-Efb5-10eDA9D920E8\",\"timestamp\":1612188825226,\"username\":\"Patricia Williams\",\"price\":14079,\"status\":\"success\"},{\"order_no\":\"5e2DA0f7-A5fD-c77E-f9A3-BfecCd7F51cE\",\"timestamp\":1612188825226,\"username\":\"Daniel Lopez\",\"price\":10315.3,\"status\":\"success\"},{\"order_no\":\"66BAEfF7-0cc9-be79-DB61-3c402aB2bBe8\",\"timestamp\":1612188825226,\"username\":\"Susan Miller\",\"price\":1591.3,\"status\":\"success\"},{\"order_no\":\"9DD79817-8d7C-5455-da97-B1aFe0873EcD\",\"timestamp\":1612188825226,\"username\":\"Melissa Rodriguez\",\"price\":14690.8,\"status\":\"pending\"},{\"order_no\":\"DDCeCbDe-A5d6-3bba-bDc8-6728f627BD6a\",\"timestamp\":1612188825226,\"username\":\"Ruth Davis\",\"price\":9512.4,\"status\":\"success\"},{\"order_no\":\"DCDcbaA1-6C03-dcc6-C8cC-Bf715aee7e3a\",\"timestamp\":1612188825226,\"username\":\"Christopher Anderson\",\"price\":11231,\"status\":\"success\"},{\"order_no\":\"72d2ca67-f4E4-1b31-B77e-Cb76eA17b6A6\",\"timestamp\":1612188825226,\"username\":\"Maria Lopez\",\"price\":2495.66,\"status\":\"pending\"},{\"order_no\":\"eB2Cb2Ee-974b-E42C-A96B-0B77a1c6eDA7\",\"timestamp\":1612188825226,\"username\":\"Joseph Moore\",\"price\":7341.88,\"status\":\"success\"},{\"order_no\":\"1FeFf317-8fDe-7689-Ac79-834bb24ED1C2\",\"timestamp\":1612188825226,\"username\":\"Christopher Martin\",\"price\":8527.81,\"status\":\"success\"},{\"order_no\":\"dd118E3f-F144-0d1F-0B1b-fC5f9e3C9b8E\",\"timestamp\":1612188825226,\"username\":\"Joseph Lee\",\"price\":3493.5,\"status\":\"pending\"},{\"order_no\":\"90f7a5Ac-f295-8Cf1-Fe9B-3c15CC6dFD07\",\"timestamp\":1612188825226,\"username\":\"Charles Wilson\",\"price\":12562.42,\"status\":\"success\"},{\"order_no\":\"AeDbD856-4ee4-7C62-e1Ef-bcFdDa8BaCfe\",\"timestamp\":1612188825226,\"username\":\"Brian Clark\",\"price\":4267.3,\"status\":\"success\"},{\"order_no\":\"dEb7DB8e-DdD3-D3cD-44d8-72EaC161F66e\",\"timestamp\":1612188825226,\"username\":\"Larry Taylor\",\"price\":13135.63,\"status\":\"pending\"},{\"order_no\":\"16469ab3-5056-DE84-A11E-78DdBEEcc955\",\"timestamp\":1612188825226,\"username\":\"Jessica Hall\",\"price\":8765.2,\"status\":\"pending\"},{\"order_no\":\"F5cDc2f3-15eE-FF92-e89c-ECad72DB51c3\",\"timestamp\":1612188825226,\"username\":\"Richard Anderson\",\"price\":1950.7,\"status\":\"success\"},{\"order_no\":\"CE692A55-E07A-4DBd-2E81-B35F01383Dd4\",\"timestamp\":1612188825226,\"username\":\"Richard Perez\",\"price\":9362.15,\"status\":\"pending\"},{\"order_no\":\"FEBffBFD-c64C-66Bb-A4fA-6c1fdB7EEAAD\",\"timestamp\":1612188825226,\"username\":\"Michelle Anderson\",\"price\":3577.9,\"status\":\"success\"},{\"order_no\":\"66482A5A-5Df2-2f8f-B3f6-9A45f3EBe1cB\",\"timestamp\":1612188825226,\"username\":\"Ronald Jackson\",\"price\":12005.69,\"status\":\"success\"},{\"order_no\":\"cb33a8A5-0cf9-693B-b3c8-De583d49c89b\",\"timestamp\":1612188825226,\"username\":\"Cynthia Williams\",\"price\":4254.7,\"status\":\"success\"}]}}";
	}

	@PostMapping("/post")
	public String hello(@RequestParam("name") String name,
	                    @RequestParam("age") Integer age) {

		JSONObject jsonObject = new JSONObject();
		jsonObject.put("name",name);
		jsonObject.put("age",age);
		return jsonObject.toJSONString();
	}
}
