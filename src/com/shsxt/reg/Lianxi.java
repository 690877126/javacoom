package com.shsxt.reg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Lianxi {
	public static void main(String[] args) {
		String str ="shi huakjd sji shi 389 udehd";
		String arr="\\b(s)(hi)\\b";
		Pattern p=Pattern.compile(arr);//转换成正则表达式
		Matcher m=p.matcher(str);//匹配器
		System.out.println(m.find());//判断是否匹配
		
		System.out.println(m.group(2));
		System.out.println(m.groupCount());
		
	}

}
