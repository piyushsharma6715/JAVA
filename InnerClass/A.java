class A
{
	void func1()
	{
		System.out.println("func1 Started!!!");
		class B
		{
		   void func1()
		   {
			A.this.func1();
			System.out.println("Welcome func1(inside)");
		   }
		   void func2()
		   {
			System.out.println("Welcome func2");
		   }
		}
		B b1=new B();
		b1.func1();
		b1.func2();
		System.out.println("func1 Exiting...");
		B b2=new B();
		b1.func1();
		b2.func2();
		B b3=new B();
		b1.func1();
		b3.func2();
	}
	public static void main(String a[])
	{
		A ob=new A();
		ob.func1();
	}
}
