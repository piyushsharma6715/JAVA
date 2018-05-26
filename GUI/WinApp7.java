import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class WinApp7 extends JFrame
{
	JLabel l;
	JTextField t;
	JButton b;
	JComboBox ch;
	WinApp7()
	{
		setTitle("Event Window");
		setLayout(new FlowLayout(FlowLayout.LEFT));
		l=new JLabel("Name");;
		t=new JTextField(30);
		b=new JButton("Submit");
		ch=new JComboBox();
		add(l);
		add(t);
		add(b);
		b.addMouseListener(new MyListener());
		add(ch);
		setSize(500,200);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public class MyListener implements MouseListener
	{
		public void mousePressed(MouseEvent e)
		{}
		public void mouseReleased(MouseEvent e)
		{}
		public void mouseEntered(MouseEvent e)
		{}
		public void mouseExited(MouseEvent e)
		{}
		public void mouseClicked(MouseEvent e)
		{
			String s=t.getText();
			ch.addItem(s);
			t.setText("");
		}
	}
	public static void main(String a[])
	{
		new WinApp7();
	}
}
