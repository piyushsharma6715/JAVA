//  FLOW LAYOUT EXAMPLE

// CLOSE EXPLICITILY


import java.awt.*;
class WinApp2
{
	WinApp2()
	{
		Frame f=new Frame();
		FlowLayout flow=new FlowLayout();
		f.setLayout(flow);
		Button b1=new Button("Button1");
		Button b2=new Button("Button2");
		Button b3=new Button("Button3");
		Button b4=new Button("Button4");
		Button b5=new Button("Button5");
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.setSize(500,500);
		f.setVisible(true);
	}
	public static void main(String a[])
	{
		new WinApp2();
	}
}
