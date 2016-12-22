package com.shsxt.file;

import java.io.File;
import java.io.IOException;

public class Lianxi01 {
	public static void main(String[] args) throws IOException {
		//创建一个不存在的文件
		File sre=new File("text1.txt");
		//创建文件
		sre.createNewFile();
		sre=new File("text12.txt");
		//创建文件夹
		sre.mkdir();//要求付文件夹存在
		 sre=new File("da/b1");
		sre.mkdir();
		sre.mkdirs();
		
	
}
}
