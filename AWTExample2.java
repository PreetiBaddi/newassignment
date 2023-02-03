import java.awt.*;
public class AWTExample2 
{
	AWTExample2()
	{
		Frame f=new Frame();
		Button b=new Button("Clear");
		b.setBounds(30,100,80,30);
		f.add(b);
		f.setSize(300,300);
		f.setTitle("This is my first awt example");
		f.setLayout(null);
		f.setVisible(true);
	}
	
	public static void main(String args[])
	{
		AWTExample2 obj=new AWTExample2();
	}
}