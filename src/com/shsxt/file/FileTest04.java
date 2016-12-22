package com.shsxt.file;

import java.io.File;
import java.io.IOException;

/**
 * 遍历下一层  listFiles()
 * 
 * 使用递归，遍历子孙级。。。。。
 * 
 * @author Administrator
 *
 */
public class FileTest04 {

	public static void main(String[] args) throws IOException {
		File src =new File("src/com/shsxt");
		if(src.isDirectory()){ //目录
			File[] sub =src.listFiles();
			for(File s:sub){
				System.out.println(s.getAbsolutePath());
			}
			
		}
	}
	
	
	

}
