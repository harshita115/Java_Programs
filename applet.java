import java.applet.Applet;
import java.awt.Graphics;
 
public class DrawLineExample extends Applet
{
 
	public void paint (Graphics g)
	{
		
		g.drawLine(10,10,50,50);
		
		
		g.drawLine(10,50,10,100);
		
		
	    g.drawLine(10,10,50,10);
	}
}