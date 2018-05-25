//  JAVA PROGRAM THAT SHOWS GUI COMPONENT  

// CLOSE THE PROGRAM EXPLICITILY BY PRESSING CTRL+C IN THE CMD 


import java.awt.*;
class WinApp1
{
	public static void main(String a[])
	{
		Frame f=new Frame();
		f.setResizable(false);
		f.setTitle("My Window");

		Panel p=new Panel();
		Label l=new Label("Find What");
		Font font=new Font("Arial",Font.ITALIC|Font.BOLD,20);
		l.setFont(font);
		l.setAlignment(Label.CENTER);
		p.add(l);

		l.setForeground(Color.red);

		TextField t1=new TextField(30);
		t1.setEchoChar('&');
		p.add(t1);
		

		Button b1=new Button("Submit");
		p.add(b1);

		MenuBar mbar=new MenuBar();
		Menu m1=new Menu("File");
		MenuItem i1=new MenuItem("New");
		MenuItem i2=new MenuItem("Open");
		m1.add(i1);
		m1.add(i2);
		mbar.add(m1);
		f.setMenuBar(mbar);

		
		Choice ch=new Choice();
		ch.addItem("Choice 1");
		ch.addItem("Choice 2");
		ch.addItem("Choice 3");
		p.add(ch);

		Checkbox ck=new Checkbox("Match Case",true);
		p.add(ck);

		CheckboxGroup ckg=new CheckboxGroup();
		Checkbox ck1=new Checkbox("Up",ckg,true);
		Checkbox ck2=new Checkbox("Down",ckg,true);
		p.add(ck1);
		p.add(ck2);

		TextArea area=new TextArea("",10,30);
		p.add(area);
		
		f.add(p);
		//f.setUndecorated(true);
		//f.setOpacity(0.6f);

		int r=(int)(255*Math.random());
		int g=(int)(255*Math.random());
		int b=(int)(255*Math.random());

		Color c=new Color(r,g,b);
		f.setBackground(c);
		
		f.setVisible(true);

		f.setAlwaysOnTop(true);
		Toolkit t=Toolkit.getDefaultToolkit();
		Dimension d=t.getScreenSize();	
		int sw=(int)d.getWidth();
		int sh=(int)d.getHeight();
		f.setLocation((sw-600)/2,(sh-200)/2);
		f.setSize(600,200);
	}
}
