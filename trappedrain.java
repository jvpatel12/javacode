
public class trappedrain{
    public static int trappedrainWater(int heigth[]){
        int n = heigth.length;

        int leftMax[] = new int [n];
        leftMax[0]   =  heigth[0];

        for(int i = 1; i<n; i++){
            leftMax[i] = Math.max(heigth[i], leftMax[i-1]);
        }

        int rightMax[]  = new int [n];
        rightMax[n-1]  = heigth[n-1];

        for(int i = n-2; i>=0; i--){
            rightMax[i] = Math.max(heigth[i],rightMax[i+1]);
        }
        int trappedrainWater= 0;

        for(int i =0; i<n; i++){
          int waterLevel= Math.min(leftMax[i],rightMax[i]);

            trappedrainWater += waterLevel - heigth[i];
        }
        return trappedrainWater;

    }
    public static void main (String args[]){
        int height []=  {4,2,0,6,3,2,5};

    System.out.println(trappedrainWater(height));
    }
}