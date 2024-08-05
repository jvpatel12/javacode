import java.nio.file.Path;

public class string31{
     static float getShortesPath(string str){

        int x=0; 
        int y =0;

        for(int i =0; i<=str.length();i++){
            char dir = str.charAt(i);

            if(dir == 's'){
                y--;

            }
            else if(dir == 'n'){
                y++;

            }
            else if(dir == 'w'){
                x--;
            }
            else{
                x++;

            }
        }
        int X2 = x*x;
        int Y2 = y*y;

        return (float)Math.sqrt(X2+Y2);

    }
    public static void main (String args[]){
        String path = "WNEENESENNN" ;
        getShortesPath(path);
    }
}