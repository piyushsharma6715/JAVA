//  SPLASH SCREEN

// CLOSE EXPLICITILY

import javax.swing.*;
import java.awt.*;
class WinApp6 extends JFrame
{
	WinApp6()
	{
		setLayout(null);
		setUndecorated(true);

		ImageIcon icon=new ImageIcon("back.png");
		JLabel l=new JLabel(icon);
		l.setBounds(0,0,500,300);

		JProgressBar pbar=new JProgressBar();
		pbar.setBounds(0,250,500,10);
			pbar.setStringPainted(true);		
		add(pbar);
		

		int pro=0;
		for(int i=1;i<=1000;i++){
			if(i%100==0){
				pro=pro+10;
				pbar.setValue(pro);
			}
		}
		
		


		add(l);
		setSize(500,300);
		Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
		int sw=(int)(d.getWidth());
		int sh=(int)(d.getHeight());
		setLocation((sw-500)/2,(sh-300)/2);
		setVisible(true);

	}
	public static void main(String a[])
	{
		new WinApp6();
	}
}
