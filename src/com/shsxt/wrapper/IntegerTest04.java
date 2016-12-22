package com.shsxt.wrapper;
/**
 * 缓存
 * Integer.valueOf();  -->推荐，内部存在缓存
 * 将-128-127进行了缓存
 * @author Administrator
 *
 */
public class IntegerTest04 {

	public static void main(String[] args) {
		Integer n1 =100; //Integer.valueOf(100)  -->IntegerCache中获取
		Integer n2 =100; //Integer.valueOf(100)  -->IntegerCache中获取
		//内容相同
		System.out.println(n1.equals(n2));
		//地址相同		
		System.out.println(n1==n2);
		
		//超出byte的范围[-128,127]
		n1 =300;  //new Integer(300)
		n2 =300; //new Integer(300)
		System.out.println(n1.equals(n2));
		System.out.println(n1==n2);
		
		/*
		 Integer[] cache = new Integer[256];
          int j = -128;
          for(int k = 0; k < cache.length; k++)
                cache[k] = new Integer(j++);		
		 */
	}

}
