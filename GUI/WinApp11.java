import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import com.sun.awt.AWTUtilities;
class WinApp11 extends JFrame implements KeyListener
{
	JLabel l;
	WinApp11()
	{
		setTitle("Event Window");
		setLayout(null);
		ImageIcon icon=new ImageIcon("lion.gif");
		l=new JLabel(icon);
		l.setBounds(x,y,162,115);
		add(l);
		addKeyListener(this);
		Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
		sw=(int)(d.getWidth());
		int sh=(int)(d.getHeight());
		setSize(sw,sh);
		setAlwaysOnTop(true);
		setUndecorated(true);
		AWTUtilities.setWindowOpaque(this,false);
		setVisible(true);
		Timer t=new Timer(600,new MyListener());
		t.start();
	}
	int sw;
	public class MyListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			x=x<sw?x+20:-162;
			l.setBounds(x,y,162,115);
		}
	}
	int y=300,x=20;
	public static void main(String a[])
	{
		new WinApp11();
	}
	boolean b=false;
	Timer t;
	public void keyPressed(KeyEvent e)
	{
		int kc=e.getKeyCode();
		if(kc==KeyEvent.VK_SPACE)
		{
		  /*Timer t=new Timer(10,new ActionListener(){
		     public void actionPerformed(ActionEvent e)
		     {
			
		     }	
		  });*/
		  t=new Timer(20,(ev)->{
			if(y>100&&!b){
				y=y-5;
				b=false;
			}else if(y<300){
				y=y+5;
				b=true;
			}else if(y==300){
				b=false;
				t.stop();
			}
			l.setBounds(x,y,162,115);
		  });
		  t.start();
		}
	}
	public void keyReleased(KeyEvent e)
	{}
	public void keyTyped(KeyEvent e)
	{}
}
