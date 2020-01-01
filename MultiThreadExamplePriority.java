package Thread;

public class MultiThreadExamplePriority extends Thread{
	public void run() {
		System.out.println("running thread name is: "+Thread.currentThread().getName());
		System.out.println("running thread priority: "+Thread.currentThread().getPriority());
		
	}
	public static void main(String args[])
	{
		ThreadLocal <Integer> obj_Local=new ThreadLocal <Integer>();
		ThreadLocal<String> obj=new ThreadLocal<String>();
		obj_Local.set(100);
		System.out.println("Value = "+obj_Local.get());
		obj_Local.set(90);
		System.out.println("Value = "+obj_Local.get());
		obj.set("JAVA");
		System.out.println("Value = "+obj.get());
		obj.remove();
		System.out.println("Value = "+obj.get());
		obj_Local.remove();
		System.out.println("Value = "+obj_Local.get());
		MultiThreadExamplePriority m1=new MultiThreadExamplePriority();
		MultiThreadExamplePriority m2=new MultiThreadExamplePriority();
		m1.setPriority(Thread.MIN_PRIORITY);
		m2.setPriority(Thread.MAX_PRIORITY);
		m1.start();
		m2.start();
		
	}

}
