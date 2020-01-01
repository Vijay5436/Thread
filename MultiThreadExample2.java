package Thread;
class Number implements Runnable
{
	public void run()
	{
		for(int i=0;i<4;i++)
			System.out.println(i);
	}
}
public class MultiThreadExample2
{
   public static void main(String args[])
  {
	Runnable obj1=new Number();
	Number obj2=new Number();
	Thread t1=new Thread(obj1);
	Thread t2=new Thread(obj2);
	t1.start();
	t2.start();
	
   }
}
