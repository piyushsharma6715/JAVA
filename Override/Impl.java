import java.util.*;
class  Impl{
	public static void main(String args[])throws Exception{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter class name");
		String ch=sc.nextLine();
		A ob= (A)Class.forName(ch).newInstance();
		ob.fn();
	}
}