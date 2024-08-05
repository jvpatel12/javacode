import java.util.*;

public class interface1 {
    interface Shape {
        abstract void Area();
    }

    static class Triangle implements Shape {
        float base;
        float height;

        public void Area() {
            System.out.println("Area of triangle is " + (0.5 * base * height));
        }
    }

    static class Rectangle implements Shape {
        float length;
        float width;

        public void Area() {
            System.out.println("Area of Rectangle is " + (length * width));
        }
    }

    static class Shpere implements Shape {
        float radius;

        public void Area() {
            System.out.println("Area of circle is " + (4 * 3.14 * radius * radius));
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Triangle T1 = new Triangle();
        System.out.println("Enter the base and height of a triangle:");
        T1.base = sc.nextFloat();
        T1.height = sc.nextFloat();
        T1.Area();
        Rectangle R1 = new Rectangle();
        System.out.println("Enter the length and width of a rectangle:");
        R1.length = sc.nextFloat();
        R1.width = sc.nextFloat();
        R1.Area();
        Shpere S1 = new Shpere();
        System.out.println("Enter radius of a circle:");
        S1.radius = sc.nextFloat();
        S1.Area();
    }
}