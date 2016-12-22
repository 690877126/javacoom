package com.shsxt.wrapper;
/**
 * 拆箱: Integer-->int
 * intValue() 
 * 自动拆箱: 运行期的行为
 * @author Administrator
 *
 */
public class IntegerTest02 {

	public static void main(String[] args) {	
		Integer numObj =Integer.valueOf(5);
		//拆箱: Integer-->int
		int num =numObj.intValue();
		//自动拆箱
		int a = numObj; //numObj.intValue();
		
		//编译蜜糖：编译通过，运行错误
		numObj =null;
		a =numObj; //编译通过，运行错误:null.intValue(); -->NullPointerException
		
	}

}
