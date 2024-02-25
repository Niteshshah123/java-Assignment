/* Write a program in java to print the area and perimeter of circle. */

public class qst7 {
    public static void main(String[] args) {
        float pi=(float) Math.PI ;
        int radius= 10;
        float area= pi*(radius*radius);
        float perimeter= 2*pi*radius;
        System.out.println("The perimeter of Circle is: "+perimeter);
        System.out.println("The Area of Circle is: "+area);
    }
}
