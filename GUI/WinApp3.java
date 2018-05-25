// FRAME LAYOUT EXAMPLE

// CLOSE THE PROGRAM EXPLICITILY


import java.awt.*;
class WinApp3
{
	WinApp3()
	{
		Frame f=new Frame();
		f.setResizable(false);
		f.setLayout(null);
		Label l1=new Label("Userid");
		l1.setBounds(350,70,60,20);
		f.add(l1);
		TextField t1=new TextField(30);
		t1.setBounds(410,70,165,25);
		f.add(t1);
		Label l2=new Label("Password");
		l2.setBounds(350,110,60,20);
		f.add(l2);
		TextField t2=new TextField(30);
		t2.setEchoChar('?');
		t2.setBounds(410,110,165,25);
		f.add(t2);
		Button b1=new Button("Submit");
		b1.setBounds(350,145,100,25);
		f.add(b1);
		Button b2=new Button("Cancel");
		b2.setBounds(460,145,100,25);
		f.add(b2);
		f.setSize(600,200);
		f.setVisible(true);
	}
	public static void main(String a[])
	{
		new WinApp3();
	}
}
