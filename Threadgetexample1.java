package Thread;

public class Threadgetexample1 {
	public static void main(String args[])
	{
		ThreadLocal<String> obj=new ThreadLocal<String>();
		obj.set("WELCOME");
		System.out.println(obj.get());
		obj.remove();
		System.out.println(obj.get());
		ThreadLocal<Integer> obj1=new ThreadLocal<Integer>();
		obj1.set(10);
		System.out.println(obj1.get());
		ThreadLocal<Float> obj2=new ThreadLocal<Float>();
		obj2.set(10.8f);
		System.out.println(obj2.get());
		
		
	}

}
