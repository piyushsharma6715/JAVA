import javax.swing.*;
import java.awt.*;
import java.lang.annotation.*;
import java.awt.event.*;
class WinApp9 extends JFrame
{
	JLabel l;
	JTextField t;
	JButton b;
	JComboBox ch;
	WinApp9()
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
	public class MyListener extends MouseAdapter
	{
		@Override
		public void mouseClicked(MouseEvent e)
		{
			String s=t.getText();
			ch.addItem(s);
			t.setText("");
		}
	}
	public static void main(String a[])
	{
		new WinApp9();
	}
}
