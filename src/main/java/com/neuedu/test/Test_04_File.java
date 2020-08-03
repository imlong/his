package com.neuedu.test;

import java.io.File;
import java.io.IOException;

//文件相关操作：创建目录、创建文件、删除文件、删除目录；
public class Test_04_File {

	public static void main(String[] args) throws IOException {
		doCreate();
		//doDelete();
	}
	
	public static void doCreate() throws IOException {
		//创建一个文件夹：d:/io
		File dir = new File("d:/io");
		if(!dir.exists()) {//如果文件夹不存在
			dir.mkdirs(); //创建文件夹
		}
		
		//创建文件 d:/io/a.txt
		File f = new File("d:/io/a.txt");
		if(!f.exists()) {
			f.createNewFile();
		}
	}
	//删除操作
	public static void doDelete() {
		File dir = new File("d:/io");
		File f = new File("d:/io/a.txt");
		
		if(f.exists()) {
			f.delete();
		}
		if(dir.exists()) {
			dir.delete();
		}
	}
}
