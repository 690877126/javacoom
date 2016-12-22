package com.shsxt.reg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 构建正则表达式  Pattern 与Matcher
 * @author Administrator
 *
 */
public class TestReg {
	public static void main(String[] args) {
		String str ="^(\\d+)sxt";
		//转成正则表达式
		Pattern p =Pattern.compile(str);
		//匹配
		Matcher m=p.matcher("abcsxt11sxt22sxt");		
		//是否匹配
		System.out.println(m.find());	//判断	
		m=p.matcher("11sxt22sxt");
		System.out.println(m.find());
		
		str ="((\\d+)(sxt))";
		p =Pattern.compile(str);
		m=p.matcher("abcsxt11sxt22sxt");
		//获取匹配的字符串
		while(m.find()){
			//组 
			System.out.println(m.groupCount()+"-->"+m.group()+"-->"+m.group(0));
			//0-->整个表达式
			//从1开始获取
			System.out.println(m.group(2)+"-->"+m.group(3));
		}
	}
}
