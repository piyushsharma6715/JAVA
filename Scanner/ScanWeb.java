import java.util.*;
import java.net.*;
class ScanWeb
{
	public static void main(String a[])throws Exception
	{
		Scanner sc1=new Scanner(System.in);
		System.out.print("Enter Zodiac Sign ");
		String zs=sc1.nextLine();
		URL u=new URL("https://www.astrology.com/horoscope/daily/"+zs+".html");
		Scanner sc2=new Scanner(u.openStream());
		String content="";
		while(sc2.hasNextLine())
		{
			String s=sc2.nextLine();
			content=content+s;
		}
String srch="<i class=\"icon-"+zs+" bg sign-color\"></i>";	
		int index1=content.indexOf(srch);
		index1=index1+srch.length()+5;
		int index2=content.indexOf("</p>",index1);
		String h=content.substring(index1,index2);
		System.out.println(h);	
	}
}
