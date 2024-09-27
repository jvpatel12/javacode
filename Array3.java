public class Array3 {
    public static void Arrayloop(){

        int [][] arr= {{56,34,6}, {34,78,90},{10,24,76}};

        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[0][2]);

        for(int i = 0; i<3; i++){
            System.out.println(arr[i]);
        }  
    }
    
    public static void main(){
        Array3 obj = new Array3();

        obj.Arrayloop();
    }
}
