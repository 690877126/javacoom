package com.shsxt.str;
/**
 * String 
 * 1、构建对象两种方式
 *   1)、字面值 -->推荐
 *   2)、new 构造器
 * 2、优化: 如果有变量|方法|运行期的行为参与运算，产生新的对象。
 * @author Administrator
 *
 */
public class StringTest01 {

	public static void main(String[] args) {
		//1)、字面值 -->推荐
		String str ="sxt";
		//2)、new 构造器
		String str2 =new String("sxt");
		
		//优化
		String a ="abc";
		String b ="1";
		String s ="abc1";
		System.out.println(s==("abc"+"1"));//编译器优化 true
		System.out.println(s==(a+"1")); //运行期  false
		
		//四个对象:abc  "1"   abc1   new String("abc1")
		
		
	}

}
