/* Write a program to compute the distance between any two point on the earth surface */

import java.util.Scanner;
public class qst13 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the point as 'x1':");
        int x1= sc.nextInt();
        System.out.println("Enter the point as 'y1':");
        int y1= sc.nextInt();
        System.out.println("Enter the point as 'x2':");
        int x2= sc.nextInt();
        System.out.println("Enter the point as 'y2':");
        int y2= sc.nextInt();

        int Distance= (int) Math.sqrt((x2-x1)+(y2-y1)); // Math.sqrt has double return type. so (int) should to convert double into integer.
        System.out.println("The distance between these two Points is: "+Distance +"Units");
    }
}


