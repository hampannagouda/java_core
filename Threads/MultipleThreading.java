package java_core.Threads;

public class MultipleThreading {
public static void main(String[] args) {
	MyThread t1 = new MyThread();
	MyThread t2 = new MyThread();
	t1.start();
	t2.start();
	System.out.println("t1 porcess id : "+t1.getId()+"thread name : "+t1.getName()+"the process priority is : "+t1.getPriority());
	System.out.println("t1 porcess id : "+t2.getId()+"thread name : "+t2.getName()+"the process priority is : "+t2.getPriority());
	t2.setPriority(10);
	t2.setName("coder2");
	System.out.println("after set priority annd name for thread 2 is :");
	System.out.println("t1 porcess id : "+t2.getId()+"thread name : "+t2.getName()+"the process priority is : "+t2.getPriority());
	
}
}
class MyThread extends Thread{
	public void run() {
		System.out.println("task running..");
	}
}
