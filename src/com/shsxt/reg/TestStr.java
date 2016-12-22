package com.shsxt.reg;

import java.util.StringTokenizer;

/**
 * 字符串与正则
 * @author Administrator
 *
 */
public class TestStr {

	public static void main(String[] args) {
		String str ="and";
		
		//完全匹配
		boolean flag =str.matches("\\b(and|or)\\b");
		System.out.println(flag);		
		
		str="\"happy\" and \"regex\" \"baidu\" or \"google\"";
		//替换所有
		str =str.replaceAll("\\b(and|or)\\b", "-->");
		System.out.println(str);
		
		//分割
		str="\"happy\" and \"regex\" \"baidu\" or \"google\"";
		//切割
		String[] arr=str.split("\\b(and|or)\\b");
		for(String temp:arr){
			System.out.println(temp);
		}
		
		arr=str.split("m"); //没有对应的，返回本身
		for(String temp:arr){
			System.out.println(temp);
		}
		
		//. -->任意字符
		str ="192.168.1.234";
		arr=str.split("\\."); //注意转义
		for(String temp:arr){
			System.out.println(temp);
		}
		
		
		//了解   StringTokenizer  默认按空格分割
		System.out.println("----------------");
		StringTokenizer st=new StringTokenizer(str, ".",true); 
		 while (st.hasMoreTokens()) {
	         System.out.println(st.nextToken());
	     }

			
	}

}
