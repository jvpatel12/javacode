public class Array2 {
    public static void multiArray(){

        int [][] arr= {{56,34,6}, {34,78,90},{10,24,76}};

        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[0][2]);


        System.out.println(arr[1][0]);
        System.out.println(arr[1][1]);
        System.out.println(arr[1][2]);

        System.out.println(arr[2][0]);
        System.out.println(arr[2][1]);
        System.out.println(arr[2][2]);

    }

    public static void main (String args[]){
        Array2 obj = new Array2();

        obj.multiArray();
    }
}
