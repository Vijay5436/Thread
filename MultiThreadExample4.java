package Thread;
public class MultiThreadExample4 extends Thread
{
	public static void main(String args[])
	{
		MultiThreadExample4 t1=new MultiThreadExample4();
		t1.start();
		
	}
	public void run()
	{
		System.out.println("Am in run method by extending thread");
	}

}
