package Thread;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Task implements Runnable {
	private String name;
	public Task(String name)
	{
		this.name=name;
	}
	public void run()
	{
		try
		{
			for(int i=0;i<5;i++)
			{
				if(i==1)
				{
					Date d=new Date();
					SimpleDateFormat ft=new SimpleDateFormat("hh:mm:ss");
					System.out.println("Time initialization for task "+this.name+ " is"+ft.format(d));
				}
				else
				{
					Date d =new Date();
					SimpleDateFormat ft=new SimpleDateFormat("hh:mm:ss");
					System.out.println("Execution time for task"+this.name+"is"+ft.format(d));
				}
				Thread.sleep(1000);
				
			}
		}
		catch(InterruptedException error)
		{
			error.printStackTrace();
			
		}
		System.out.println(this.name+" completed.");
	}

}
