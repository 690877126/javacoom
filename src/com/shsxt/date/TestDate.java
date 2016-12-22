package com.shsxt.date;

import java.util.Date;

/**
 * 1、获取当前时间
 * new Date()
 * System.currentTimeMillis();  
 * @author Administrator
 *
 */
public class TestDate {

	public static void main(String[] args) {
		//当前时间 -->日期格式
		Date nowTime =new Date();
		System.out.println(nowTime);
		//当前时间 -->长整形数
		long nowTime2 =System.currentTimeMillis();
		System.out.println(nowTime2);
		
	}

}
