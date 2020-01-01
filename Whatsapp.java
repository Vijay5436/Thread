package Thread;


public class Whatsapp implements Runnable {
	Thread t;
	Whatsapp()
	{
		t=new Thread(this);
		System.out.println("Music playing");
		t.start();
		t.interrupt();
	}
	public void run()
	{
		try
		{
			while(true)
			{
				Thread.sleep(1000);
			}
		}
			catch(InterruptedException e)
			{
				System.out.println("Recived a whatsapp msg pops..");
			}
		}
	public static void main(String args[])
	{
		new Whatsapp();
	}
	}


