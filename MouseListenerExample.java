import java.awt.*;  
import java.awt.event.*; 
import java.awt.applet.Applet.*; 
public class MouseListenerExample extends Applet implements MouseListener{  
   int x=30,y=30;
   String msg="Mouse Events";
    public void init()
	{
		addMouseListner(this);
		
		setBackground(Color.black);
		setForeground(Color.white);
	}
    public void mouseClicked(MouseEvent e) {  
        msg="Mouse Clicked";  
		setBackground(Color.pink);
		showStatus("Mouse Clicked");
		repaint();
    }  
    public void mouseEntered(MouseEvent e) {  
        msg="Mouse Entered";  
		setBackground(Color.green);
		showStatus("Mouse Entered");
		repaint(); 
    }  
    public void mouseExited(MouseEvent e) {  
       msg="Mouse Exited";  
		setBackground(Color.yellow);
		showStatus("Mouse Exited");
		repaint(); 
    }  
    public void mousePressed(MouseEvent e) {  
         msg="Mouse Pressed";  
		setBackground(Color.blue);
		showStatus("Mouse Pressed");
		repaint();   
    }  
    public void mouseReleased(MouseEvent e) {  
		msg="Mouse Released";  
		setBackground(Color.magenta);
		showStatus("Mouse Released");
		repaint();     
		}   
		
		public void paint(Graphics g){
			g.drawString(msg,x,y);
		}
}  