import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import com.sun.awt.AWTUtilities;
class WinApp10 extends JFrame
{
	JLabel l;
	WinApp10()
	{
		setTitle("Event Window");
		setLayout(null);
		ImageIcon icon=new ImageIcon("lion.gif");
		l=new JLabel(icon);
		l.setBounds(0,300,162,115);
		add(l);
		Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
		sw=(int)(d.getWidth());
		int sh=(int)(d.getHeight());
		setSize(sw,sh);
		setAlwaysOnTop(true);
		setUndecorated(true);
		AWTUtilities.setWindowOpaque(this,false);
		setVisible(true);
		Timer t=new Timer(500,new MyListener());
		t.start();
	}
	int sw;
	public class MyListener implements ActionListener
	{
		int x=20;
		public void actionPerformed(ActionEvent e)
		{
			x=x<sw?x+10:-162;
			l.setBounds(x,300,162,115);
		}
	}
	public static void main(String a[])
	{
		new WinApp10();
	}
}
