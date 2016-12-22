package com.shsxt.math;
/**
 * Math为工具类
 * ceil() -->向上取整  	 >=最小整数
 * floor() -->向下取整  <=最大整数
 * @author Administrator
 *
 */
public class TestMath {

	public static void main(String[] args) {
		System.out.println((int)Math.ceil(3.5)); 
		System.out.println((int)Math.ceil(-3.5));
		System.out.println((int)Math.floor(3.5));
		System.out.println((int)Math.floor(-3.5));
		
		//计算页面
		//500条总记录   每页12条   分多少页
		System.out.println(500*1.0/12); 
		
		//分页的总数为
		System.out.println((int)Math.ceil(500*1.0/12)); 
		//另外的思路
		System.out.println((500+12-1)/12); 
	}

}
