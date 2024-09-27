import java.util.*;

public class sellandbuy {
    public static int buyAndSellstocks(int prices[]){
        int buyprices = Integer.MAX_VALUE;
        int maxprofits = 0; 

        for(int i=0; i<prices.length;i++){
            if(buyprices<prices[i]){
                int profit = prices[i] - buyprices;
                maxprofits = Math.max(maxprofits, profit);

            }
            else{
                buyprices = prices[i];
            }
        }
        
            return maxprofits;
        }
        public static void main (String args[]){
    int prices[] = {7,1,5,3,6,4};
    System.out.println(buyAndSellstocks(prices));

}
}