public class Array1{
    public static void demoArrays(){

        int[] ages = new int[3];
        float[] weights = new float[3];
        String[] names = new String[2];

        ages[0]=24;
        ages[1]=12;
        ages[2]=34;

        weights[0]=23.8f;
        weights[1]=34.8f;

        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);

        System.out.println(weights[1]);
    }




    public static void main(String args[]){
        Array1 obj = new Array1();
        obj.demoArrays();

    }
}
