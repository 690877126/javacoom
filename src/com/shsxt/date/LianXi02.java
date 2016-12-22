package com.shsxt.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LianXi02 {
	public static void main(String[] args) throws ParseException {
		Date time =new Date();
		System.out.println(time);
		System.out.println(time.getTime());
		String str ="2015年12月02日";
		long time1=System.currentTimeMillis();
		System.out.println(time1);
	/*	年: y
		月: M
		日: d
		小时:H(0,23)
		小时；h(0,12)
		m :分
		s :秒
		S :毫秒
		*/
		//SimpleDateFormat(模板)
		DateFormat df=new SimpleDateFormat("yyyy年MM月dd日");
		//Date time11 = df.parse(str);
		//System.out.println(time11);
	//	str =df.format(time11);
		//System.out.println(str);
		Date time9=new Date(546589789956564689L);
		str =df.format(time9);
		System.out.println(str);
		// y M d Hh m s S ; prase();字符串转换日期
		// format  日期转换字符串
		
		
		
		
	}
}
