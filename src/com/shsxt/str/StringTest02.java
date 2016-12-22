package com.shsxt.str;
/**
 * StringBuilder StringBuffer 方法一样
 * 可变的字符串:字符串的拼接 * 
 * String: + * 
 * 大量字符串拼接 ，推荐使用append.
 * 
 * 
 * 
 * @author Administrator
 *
 */
public class StringTest02 {
	public static void main(String[] args) {
		StringBuilder builder =new StringBuilder();
		builder.append("a").append("-->").append("bc");
		//修改 -->查看api
		System.out.println(builder.reverse());
		
		//回文字符串    dad   refer  test
		String str ="test";
		
		System.out.println(isBackWords("dad"));
		
		
		
	}
	/**
	 * 回文
	 * @param str
	 * @return
	 */
	public static boolean isBackWords(String str){
		return new StringBuilder(str).reverse().toString().equals(str);
	}
	public static void main3(String[] args) {
		StringBuilder str =new StringBuilder("sxt"); 
		//12818504
		System.out.println(Runtime.getRuntime().freeMemory()+"=====");
		for(int i=0;i<=100000;i++){
			str.append(i);//追加
		}
		System.out.println(Runtime.getRuntime().freeMemory()+"=====");
	}
	public static void main2(String[] args) {
		String str ="sxt"; 
		//15528056
		System.out.println(Runtime.getRuntime().freeMemory()+"=====");
		for(int i=0;i<=100000;i++){
			str+=i;
		}
		System.out.println(Runtime.getRuntime().freeMemory()+"=====");
	}

}
