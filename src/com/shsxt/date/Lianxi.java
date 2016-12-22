package com.shsxt.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



public class Lianxi {
public static void main(String[] args) throws ParseException {

	String srr="2016年12月01日  16:55:30";
	//专程日期
	//模板
	//发生多态
	DateFormat df=new SimpleDateFormat(("yyyy年MM月dd日 hh:mm:ss"));
	Date time =df.parse(srr);//转换成以毫秒计算
	System.out.println(time.getTime());
	time=new Date(0);
	srr =df.format(time);//转成字符串
	System.out.println(srr);
	Date arr=new Date(48789498897L);
	System.out.println(arr);
	arr.setTime(System.currentTimeMillis()+1L*60*60*1000);
	System.out.println(arr.getTime());
	
	
	
	
}
}
