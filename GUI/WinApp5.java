//  SWING GUI PROGRAM

import java.awt.*;
import javax.swing.*;
class WinApp5
{
	WinApp5()
	{
		JFrame f=new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ImageIcon icon=new ImageIcon("logo.png");
		f.setIconImage(icon.getImage());
		
		//f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		//f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		//f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		GridBagLayout gb=new GridBagLayout();
		f.setLayout(gb);
		GridBagConstraints gbc=new GridBagConstraints();
		gbc.insets=new Insets(10,10,10,10);
		gbc.anchor=GridBagConstraints.WEST;
		JLabel l1=new JLabel("Userid");
		gbc.gridx=1;
		gbc.gridy=1;
		gb.setConstraints(l1,gbc);
		f.add(l1);
		JTextField t1=new JTextField(30);
		gbc.gridx=2;
		gbc.gridy=1;
		gb.setConstraints(t1,gbc);
		f.add(t1);
		JLabel l2=new JLabel("Password");
		gbc.gridx=1;
		gbc.gridy=2;
		gb.setConstraints(l2,gbc);
		f.add(l2);
		JPasswordField t2=new JPasswordField(30);
		gbc.gridx=2;
		gbc.gridy=2;
		gb.setConstraints(t2,gbc);
		t2.setEchoChar('?');
		f.add(t2);
		JButton b1=new JButton("Submit");
		gbc.gridx=1;
		gbc.gridy=3;
		gb.setConstraints(b1,gbc);
		f.add(b1);
		JButton b2=new JButton("Cancel");
		gbc.gridx=2;
		gbc.gridy=3;
		gb.setConstraints(b2,gbc);
		f.add(b2);
		f.setSize(600,200);
		try{
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		SwingUtilities.updateComponentTreeUI(f);
		}catch(Exception e)
		{}
		f.setVisible(true);
	}
	public static void main(String a[])
	{
		new WinApp5();
	}
}
