package com.neuedu.test;

//实现多线程方式一：继承Thread类
public class Test_01_Thread {

	public static void main(String[] args) {
		//创建两个线程对象
		Thread t1 = new MyThread("线程A");
		Thread t2 = new MyThread("线程B");
		
		//启动线程
		t1.start();
		t2.start();
	}
}
//创建一个类继承Thread类，则这个类的对象就是线程对象了；
class MyThread extends Thread{
	
	public MyThread() {}
	public MyThread(String name) {
		super(name);
	}
	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println(Thread.currentThread().getName() + "  " + i);
		}
	}
}
