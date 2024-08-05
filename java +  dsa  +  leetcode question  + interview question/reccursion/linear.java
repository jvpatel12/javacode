package reccursion;

public class linear {

    static boolean linear(int arr[],int target,int index){
        if(index == arr.length) return false;

        return arr[index]==target && linear(arr, target, index+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int target =3;
        System.out.println(linear(arr, target, 0));
    }
}
