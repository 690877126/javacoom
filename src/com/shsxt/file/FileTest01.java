package com.shsxt.file;

import java.io.File;

/**
 * 相对路径与绝对路径
 * 
 * 
 * @author Administrator
 *
 */
public class FileTest01 {

	public static void main(String[] args) {
		//绝对路径
		File src =new File("D:\\shsxt\\003_code\\1116\\wk\\commons\\src\\com\\shsxt\\file\\FileTest01.java");
		printInfo(src);
		//相对路径-->默认相对于当前工程
		src=new File("FileTest01.java");
		printInfo(src);
		//相对路径
		src=new File("src/com/shsxt/file/FileTest01.java");
		printInfo(src);
		
		//以父路径形式指定
		src=new File(new File("src/com/shsxt/file"),"FileTest01.java");
		printInfo(src);
	}
	
	public static void printInfo(File src){
		System.out.println("======================");
		System.out.println(src.getName());//名字
		System.out.println(src.getPath()); //相对路径
		System.out.println(src.getAbsolutePath()); //绝对路径
	}

}
