package Thread;

public class MultiThreadExample5 implements Runnable
{
  public static void main(String args[])
   {
	MultiThreadExample5 ts=new MultiThreadExample5();
	Thread t1=new Thread(ts);
	t1.start();
   }
  public void run()
   {
	System.out.println("Am in run method by implementing runnable");	
   }
}
