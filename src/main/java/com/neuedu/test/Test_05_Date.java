package com.neuedu.test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

//对文件的访问：读取文件内容、写数据到文件(字节流)
public class Test_05_Date {

	public static void main(String[] args) throws Exception {
		doWrite();
		doRead();
	}

	public static void doWrite() throws Exception {
		File f = new File("d:/io/a.txt");
		//创建输出流对象，用来向文件写数据
		FileWriter fw = new FileWriter(f, true); //参数true表示保留原来内容
		String s = "测试输出流\r\n好用不？\r\n";
		fw.write(s);
		fw.close(); //释放资源
	}
	
	public static void doRead() throws Exception {
		File f = new File("d:/io/a.txt");
		//创建输入流对象，用来从文件读取数据
		FileReader fr = new FileReader(f);
		int i = -1; //创建一个变量，保存输入流读取的字符
		while( (i=fr.read()) != -1 ) {
			System.out.print((char)i); //这里不带换行的输出；
		}
		fr.close();
	}
}
