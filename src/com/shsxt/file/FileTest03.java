package com.shsxt.file;

import java.io.File;
import java.io.IOException;

/* 创建
 * 1、文件-->createNewFile
 * 2、目录 -->mkDir() :父文件夹存在
 *         mkDirs() :父文件夹不存在，一同创建
 * 
 * 
 * @author Administrator
 *
 *
 */
public class FileTest03 {

	public static void main(String[] args) throws IOException {
		//创建一个不存在的文件
		File src =new File("test.txt");
		//1、创建文件
		src.createNewFile();
		src =new File("test2");
		//2、创建文件夹
		src.mkdir();  //要求父文件夹存在
		src =new File("a/b");
		src.mkdir(); 
		src.mkdirs(); //父文件夹不存在，一同创建
	}
	
	
	

}
