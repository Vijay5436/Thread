package Thread;

public class Whatsapp2 extends Thread
{
	public void run()
	{
		try
		{
			System.out.println("Music playing");
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			System.out.println("pops...");
			
		}
	}
 public static void main(String aargs[])
 {
	 Whatsapp2 w=new Whatsapp2();
	 w.start();
	 w.interrupt();
 }
}
