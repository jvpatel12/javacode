import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;

public class p9_6 extends Applet{
    Image img;
   public void i(){
    img=getImage(getDocumentBase(),"car.png");

   }
   public void paint(Graphics g){
    for(int i=0;i<400;i++){
        g.drawImage(img, i, 20, this);
    }
    try {
        thread.sleep(10);
    } catch (Exception e) {
        // TODO: handle exception
         
    
    }
   }
}
