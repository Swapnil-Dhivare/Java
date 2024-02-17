import javax.crypto.spec.PSource;
import java.util.Scanner;

public class circumferenceandareaofcircle {
    /*
        Q:  Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
            Area of circle = πr*r
            Circumference of circle = 2πr
            pi = 3.14

     */
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the value of the radius: ");
     float r = input.nextFloat();
    float circum = circum(r);
    System.out.println("The circumference of the circle is: " + circum);


    float area = area(r);
    System.out.print("The area of the circle is: " + area);
//    System.out.println(area);

}

     static float circum(float r){
        float pi = 3.14F;
        float circum = 2*pi*r;
        return circum;
     }

     static float area(float r){
    float pi = 3.14F;
    float area = pi*r*r;
    return area;
     }
}
