import java.applet.Applet;
import java.awt.Graphics;
 
public class DrawRectanglesExample extends Applet{
 
	public void paint(Graphics g){
		
				
		g.drawRect(10,10,50,100);
		
		g.drawRect(100,100,50,50);
	}
}
