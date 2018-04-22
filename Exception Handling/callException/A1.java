class A1
{
	static void func()throws ClassNotFoundException,InstantiationException,IllegalAccessException
	{
		A cm=(A)Class.forName("A").newInstance();
		cm.func();
	}
	public static void main(String a[])
	{
		try
		{
			func();
		}

 // will arise when class A will not be found


		catch(ClassNotFoundException e)
		{
			System.out.println("class file not available");
		}

// will arise if A is an interface or is abstract in nature


		catch(InstantiationException e)
		{
			System.out.println("Unable to create instance");
		}

// will arise if A has a private type constructor declared in it.


		catch(IllegalAccessException e)
		{
			System.out.println("private constructor in class");
		}
		System.out.println("Successfully Exited");
	}
}
