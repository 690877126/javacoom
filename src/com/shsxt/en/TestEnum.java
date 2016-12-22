package com.shsxt.en;
/**
 *
 * 1、就是常量实例的集合
 * 2、可以使用在switch
 * 3、name() ordinal() values()
 * 4、复杂的枚举会使用类替代
 * @author Administrator
 *
 */
public class TestEnum {

	public static void main(String[] args) {
		Dir dir =Dir.UP;
		switch(dir){
			case DOWN:
			case LEFT:
			default:
				System.out.println("default");
		}
		
		System.out.println(dir.name());
		System.out.println(dir.ordinal());
		Dir[] instances=Dir.values();
		for(Dir d:instances){
			System.out.println(d.name());
		}
	}

}
//看成特殊的类
enum Dir{	
	UP("0"),DOWN("1"),LEFT("2"),RIGHT("3");
	public String s;
	private Dir(String s){
		this.s =s;
	}	
}

class MyDir{
	public static final MyDir UP =new MyDir();
}
