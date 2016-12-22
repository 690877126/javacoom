package com.shsxt.date;

import java.util.Date;

/**
 * 2、与毫秒数的转换
 *  new Date(毫秒数)
 *  getTime()
 *  setTime(毫秒数)
 * @author Administrator
 *
 */
public class TestDate02 {

	public static void main(String[] args) {
		//long -->Date
		Date myDate =new Date(77979789879879879L);
		System.out.println(myDate);
		
		//修改时间
		myDate.setTime(System.currentTimeMillis()+1L*60*60*1000);
		System.out.println(myDate);
		
		
		//获取时间
		long num =myDate.getTime();
		System.out.println(num);
		
		
	}

}
