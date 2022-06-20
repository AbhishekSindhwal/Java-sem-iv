class Disp
{
	public synchronized void wish(String s)
	{
		for(int i=1;i<=5;i++)
		{
			System.out.print("Hello"+"  ");
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			} 
		System.out.println(s);
		}
	}
}
class MyThread extends Thread
{
	Disp d;
	String name;
	MyThread(Disp d,String name)
	{
		this.d=d;
		this.name=name;
	}
	public void run()
	{
		d.wish(name);
	}
}
class Demo
{
	public static void main(String args[])
	{
		Disp d= new Disp();
		MyThread t1=new MyThread(d,"Ambuj");
		t1.start();
		MyThread t2=new MyThread(d,"Bhandari");
		t2.start();
	}
}
