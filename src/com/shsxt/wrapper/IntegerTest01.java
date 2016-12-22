package com.shsxt.wrapper;
/**
 * 装箱: int-->Integer
 * 1、new Integer();
 * 2、Integer.valueOf();
 * 
 * 自动装箱: 运行期的行为
 * @author Administrator
 *
 */
public class IntegerTest01 {

	public static void main(String[] args) {
		int num =5;
		//装箱1:获取Integer对象
		Integer numObj =new Integer(num);
		//装箱2:Integer.valueOf();
		numObj =Integer.valueOf(num);
		
		//自动装箱
		Integer obj = 5; //jvm: 使用Integer.valueOf(5); 装箱
		
		System.out.println(obj);
	}

}
