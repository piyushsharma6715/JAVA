
// A Simple Java program that differentiate between a value according to the refrence type 

class Parent
{
	int  num=10;
	void func()
	{
		System.out.println("Parent:func");
	}
}
class Child extends Parent
{
	int  num=20;
	void func()
	{
		System.out.println("Child:func");
	}
	public static void main(String a[])
	{
		Parent p=new Child();
		Child c=(Child)p;
		System.out.println("Value of parent num is "+p.num+" Value of Child num is "+c.num);
	}
}
