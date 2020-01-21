package Thread;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class ThreadPoolExample 
{
	public static void main(String args[])
	{
		Runnable task1=new Task("taskk 1");
		Runnable task2=new Task("taskk 2");
		Runnable task3=new Task("taskk 3");
		Runnable task4=new Task("taskk 4");
		Runnable task5=new Task("taskk 5");
		ExecutorService pool =Executors.newFixedThreadPool(3);
		pool.execute(task1);
		pool.execute(task2);
		pool.execute(task3);
		pool.execute(task4);
		pool.execute(task5);
		pool.shutdown();
	}

}
