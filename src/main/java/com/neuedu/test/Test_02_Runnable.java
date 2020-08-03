package com.neuedu.test;

//实现多线程方式二：实现Runnable接口
public class Test_02_Runnable {

	public static void main(String[] args) {
		//创建目标对象
		MyRunnable mr = new MyRunnable();
		//创建线程对象
		Thread t1 = new Thread(mr, "线程A");
		Thread t2 = new Thread(mr, "线程B");
		
		//启动线程
		t1.start();
		t2.start();
	}
}

//创建一个类实现Runnable接口；这个类的对象就是多个线程执行的目标对象，被多个线程共享；
class MyRunnable implements Runnable{
	
	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println(Thread.currentThread().getName() + "  " + i);
		}
	}
}