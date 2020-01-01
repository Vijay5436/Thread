package Thread;
class number1 extends Thread
	{
		public void run()
		{
			for(int i=0;i<10;i++)
				System.out.println("Thread is running: "+i);
		}
	}
class number2 extends Thread
	{
		public void run()
		{
			for(int i=10;i<20;i++)
				System.out.println("Thread2 is running: "+i);
		}
	}
public class MultiTreadExample1 {
		public static void main(String args[])
		{
			number1 thread1=new number1();
			number2 thread2=new number2();
			thread1.start();
			thread2.start();
		}
	
}

