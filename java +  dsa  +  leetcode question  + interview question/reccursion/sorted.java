package reccursion;

public class sorted {
    static boolean sorted(int arr[],int index){
        if(arr.length -1 == index) return true;

        return arr[index]<arr[index+1] && sorted(arr, index+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
       System.out.println(sorted(arr, 0));

    }
}
