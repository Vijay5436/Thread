package Thread;

public class DeamonThreadExample1 extends Thread {
	public void run()
	{
		if(Thread.currentThread().isDaemon())//checking for daemon thread
		{
			System.out.println("Daemon thread is work.");
		}
		else
		{
			System.out.println("User thread is work");
		}
	}
	public static void min(String args[])
	{
		DeamonThreadExample1 t1=new DeamonThreadExample1();
		DeamonThreadExample1 t2=new DeamonThreadExample1();
		DeamonThreadExample1 t3=new DeamonThreadExample1();
		t1.setDaemon(true);//now t1 is daemon thread
		t1.start();//starting thread
		t2.start();
		t3.setDaemon(true);
		t3.start();
		
		
	}

}
