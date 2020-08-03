package com.neuedu.test;


//对代码加锁，保证线程安全
public class Test_03_Runnable {

	public static void main(String[] args) {
		//创建目标对象
		MyTicket mr = new MyTicket();
		//创建线程对象
		Thread t1 = new Thread(mr, "1号窗口");
		Thread t2 = new Thread(mr, "2号窗口");
		
		//启动线程
		t1.start();
		t2.start();
	}
}

//创建一个类模拟车票
class MyTicket implements Runnable{
	private int counts = 20;//初始20张票
	
	@Override
	public void run() {
		
		while(counts>0) {
			synchronized (this) {//线程加锁，加锁后线程只会有一个执行
				if (counts>0) {
					System.out.println(Thread.currentThread().getName() + "卖掉" + counts);
					counts--;
				}
			}
		}
	}
}