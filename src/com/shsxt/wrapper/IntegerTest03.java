package com.shsxt.wrapper;
/**
 * 字符串: 
 * 1、前提: 全部为数字的字符串
 * 2、String -->Integer
 *    new Integer()
 *    Integer.valueOf()
 *    parseInt()
 * 3、Integer -->String 
 *    int -->String 
 *    toString()
 *    +
 * @author Administrator
 *
 */
public class IntegerTest03 {

	public static void main(String[] args) {
		String str ="a123"; //前提: 全部为数字的字符串
		str ="123"; //字符串
		
		//转成Integer
		Integer obj =new Integer(str);
		obj =Integer.valueOf(str);
		obj =Integer.valueOf("012",8);
		System.out.println(obj);
		if(isOctalString("012s")){
			int a =Integer.parseInt("012s",8);	
			System.out.println(a);
		}else{
			System.out.println("格式不符合8进制");
		}
		//转成字符串
		String objStr =obj.toString();
		objStr =obj+"";
		objStr =5+"";
	}
	
	/**
	 * 匹配8进制的字符串
	 * @param str
	 * @return
	 */
	public static boolean isOctalString(String str){
		String reg ="0[0-7]+";
		return str.matches(reg);
	}
}
