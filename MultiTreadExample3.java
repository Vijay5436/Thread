package Thread;
class MusicPlayer extends Thread
{
	public void run() 
	{
			System.out.println("Music is playing");
	}
}
 class MsWord implements Runnable
{
	public void run()
	{
		System.out.println("Typing MsWord document");
	}
	
}

public class MultiTreadExample3 
{
	public static void main(String args[])
	{
	MusicPlayer m=new MusicPlayer();
	
	Runnable r=new MsWord();
	Thread t1=new Thread(r);
	m.start();
	t1.start();
    }
}
