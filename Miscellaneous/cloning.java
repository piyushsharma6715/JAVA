 //  A Simple Java for program that makes a clone of the given function.
 
class cloning implements Cloneable
{
	String name,city;
	float salary;
	public static void main(String a[])throws Exception
	{
		cloning e1=new cloning();
		e1.name="Pranjul";
		e1.city="Kanpur";
		e1.salary=120000;
		Emp e2=(Emp)e1.clone();
		System.out.println(e2.name+" "+e2.city+" "+e2.salary);
		e2.name="Piyush";
		System.out.println(e1.name+" "+e1.city+" "+e1.salary);
		System.out.println(e2.name+" "+e2.city+" "+e2.salary);
	}
	
}
