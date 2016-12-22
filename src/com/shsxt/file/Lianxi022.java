package com.shsxt.file;

import java.io.File;
import java.io.IOException;

public class Lianxi022 {
	public static void main(String[] args) throws IOException {
		/*File src =new File("D:\\shsxt\\003_code\\1116\\wk\\commons\\src\\com\\shsxt\\file\\FileTest01.java"); 
		System.out.println(src.getName());//名字
		System.out.println(src.getParentFile());//
		System.out.println(src.getAbsolutePath());//绝对路径
		System.out.println(src.getPath());//相对路径
		File sre =new File("D:\\shsxt\\003_code\\1116\\wk\\commons\\src\\com\\shsxt\\file\\FileTest01.java");
		if(sre.exists()){
			System.out.println("测试文件是否存在");
		}else if(sre.isFile()){
			System.out.println("测试文件是否为标准文件");
		}else if(sre.canWrite()){
			System.out.println("测试文件是否为文件目录"+sre.length());
		}else{
			System.out.println("文件不存在");
			}
			File arr =new File("tgdd.txt");//创建一个不存在的文件
			//创建一个文件
			arr.createNewFile();
			File arr1=new File("text112.txt");
			arr1.mkdir();
			File arr2=new File("text45/sddf");
			arr2.mkdirs();*/
			File arr56=new File("com.shsxt.file");
			if(arr56.isDirectory()){
				File[] a=arr56.listFiles();
				
				for(File g:a){
					System.out.println(g.getAbsolutePath());
				
				}
				}else{
					System.out.println("错了");
				
			
			
		}
		
	}

}
