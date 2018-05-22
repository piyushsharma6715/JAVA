// A Java program to display the working of garbage collector in Java

class Garbage
{
	int num;
	protected void finalize()
	{
	 System.out.println("Object no "+num+" destroyed");	
	}
	public static void main(String a[])throws Exception
	{
	    for(int i=1;i<=100;i++)
	    {
		Garbage g=new Garbage();
		g.num=i;
	    }
	    System.gc();	
	    Thread.sleep(2000);	
	}
}
