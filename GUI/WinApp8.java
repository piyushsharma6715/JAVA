import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class WinApp8 extends JFrame
{
	WinApp8()
	{
		setTitle("Event Window");
		setSize(500,200);
		addMouseListener(new MyListener());
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public class MyListener implements MouseListener
	{
		public void mousePressed(MouseEvent e)
		{
			getContentPane().setBackground(Color.red);
		}
		public void mouseReleased(MouseEvent e)
		{
			getContentPane().setBackground(Color.green);
		}
		public void mouseEntered(MouseEvent e)
		{
			getContentPane().setBackground(Color.blue);
		}
		public void mouseExited(MouseEvent e)
		{
			getContentPane().setBackground(Color.yellow);
		}
		public void mouseClicked(MouseEvent e)
		{
			getContentPane().setBackground(Color.magenta);			
		}
	}
	public static void main(String a[])
	{
		new WinApp8();
	}
}
