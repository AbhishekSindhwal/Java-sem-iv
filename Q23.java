class Disp
{
	public static synchronized void wish(String s)
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
		Disp d1= new Disp();
		Disp d2= new Disp();
		MyThread t1=new MyThread(d1,"Ambuj");
		t1.start();
		MyThread t2=new MyThread(d2,"Bhandari");
		t2.start();
	}
}
