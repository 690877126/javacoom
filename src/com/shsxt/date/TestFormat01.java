package com.shsxt.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
y:  年
M: 月
d:  日
H: 小时[0,23]
h: 小时[1,12]
m:  分
s:秒
S:毫秒

SimpleDateFormat(模板)
1、String-->Date :parse()
2、Date -->String : format()


 * @author Administrator
 *
 */
public class TestFormat01 {

	public static void main(String[] args) throws ParseException {
		String dateStr ="2016年12月01日  16:55:30";		
		//转成日期
		DateFormat df =new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss");		
		Date time =df.parse(dateStr);
		System.out.println(time.getTime());
		
		
		//转成字符串
		time =new Date(0);
		dateStr =df.format(time);
		System.out.println(dateStr);
		
		
		dateStr ="2016年12月01日  16:55:30";	
		df =new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");	
		time =df.parse(dateStr); //Unparseable date 不符合格式
		System.out.println(time.getTime());
		
	}

}
