package com.example.LC;

import java.util.ArrayList;
import java.util.List;



public class LCTest {
	public int[] twoSum(int[] nums, int target) {
		int[] res=new int[2];
		int findInt=0;
		for (int i=0;i<nums.length;i++){
			int currentInt = nums[i];
			findInt = target-currentInt;
			if(findInt==currentInt){
				continue;
			}
			if(ifExist(nums,findInt)){
				res[0]=i;
				break;
			}
		}
		int secondVVal=findVal(nums,findInt);
		if(secondVVal!=-1){
			res[1]=secondVVal;
		}
		System.out.println(res[0]);
		System.out.println(res[1]);
		return res;
	}

	public boolean ifExist(int[] nums, int target){
		for(int i:nums){
			if(i==target){
				return true;
			}
		}
		return false;
	}

//	public String longestCommonPrefix(String[] strs) {
//		int minlen = 0;
//		String minStr = "";
//		for (String str : strs) {
//			if (str.length() <= minlen) {
//				minStr = str;
//				minlen = minStr.length();
//			}
//		}
//	}

	public int findVal(int[] nums, int target){
		for (int i=0;i<nums.length;i++){
			if(nums[i]==target){
				return i;
			}
		}
		return -1;
	}

//	public static int method1(){
//		int i = 0;
//		try {
//			return i;
//		}
//		catch (Exception e){
//
//		}finally {
//			i=i+1;
//		}
//	}

	public static int method2(){
		int i = 0;
		try {
			return i;
		}
		catch (Exception e){

		}finally {
			i=i+1;
			return i;
		}
	}

	public static class People{
		String name;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		int age;

	}

	public static void test(){
		List<Integer> lis = new ArrayList<>();
		lis.add(1);

	}


	public static void main(String[] args) {
		String s= "abcdefg";
		People peo = new People();
		peo.setAge(12);
		peo.setName("xiaowang");
		System.out.println(peo);
		String str1 ="";

		System.out.println(s.substring(1,5));
		LCTest lcTest = new LCTest();
		int[] a = new int[]{2,7,11,15};
		for (Integer i:a){
			System.out.println(i);
		}
		int t = 9;
		String[] strs = {"abcd","a"};
		int o = method2();
		System.out.println(o);
//		lcTest.twoSum(a,t);
//		lcTest.longestCommonPrefix(strs);

	}
}
