// A Simple Java Program that takes a set of integer in command line and return the second highest in O(N) Complexity.


class com
{
	public static void main(String a[])
	{
		int n=a.length;
		int max=Integer.parseInt(a[0]),smax=0;
		for(int i=0;i<n;i++)
		{
			int temp=Integer.parseInt(a[i]);
			if(temp>max){
				smax=max;
				max=temp;
			}else if(smax<temp)
				smax=temp;
		}
		System.out.println("Second Highest is "+smax);
	}
}
