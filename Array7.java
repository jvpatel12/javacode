public class Array7 {
    public static  int binarySearch(int number[],int  key){
        int start=0,end=number.length-1;

        while(start<=end){
           int  mid=(start+end)/2;

           if(number[mid]==key){
            return mid;
           }
           if(number[mid]<key){
            return mid+1;
           }
           if(number[mid]>key){
            return mid-1;
           }
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[] = {2,3,4,5,6,7,8};
        int key = 4;

        System.out.println("index point"+ binarySearch(numbers, key));
    }
    
}
