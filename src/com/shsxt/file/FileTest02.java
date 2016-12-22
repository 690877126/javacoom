package com.shsxt.file;

import java.io.File;

/**
 * 状态
 * 
 * 
 * @author Administrator
 *
 */
public class FileTest02 {

	public static void main(String[] args) {
		//绝对路径
		File src =new File("D:\\shsxt\\003_code\\1116\\wk\\commons\\src\\com\\shsxt\\file\\FileTest01.java");
		//状态
		getInfo(src);		
		src =new File("D:\\shsxt\\003_code\\1116\\wk\\commons");
		getInfo(src);
		
	}
	public static void getInfo(File src){
		if(!src.exists()){//测试文件是否存在
			System.out.println("文件不存在");
		}else if(src.isFile()){ //测试是否为标准文件
			System.out.println(src.length());
		}else if(src.isDirectory()){//测试是否是个目录
			System.out.println("目录，不能直接获取大小"+src.length());
		}
	}
	
	

}
