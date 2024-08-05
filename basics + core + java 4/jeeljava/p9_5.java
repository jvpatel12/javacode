import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class p9_5 extends Applet {
    public void init(){
         setBackground(Color.green);
         setForeground(Color.white);
    }
    public void paint(Graphics g){
        g.drawString("heelo", 50, 100);
    }
}
