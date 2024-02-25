import java.util.Scanner;

public class areaRectangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length");
        int length= sc.nextInt();
        System.out.println("Enter the breath");
        int breath= sc.nextInt();        
        area ar= new area(length, breath);
        int recArea= ar.returnarea();
        System.out.println("the area is : "+ recArea);
    }
}
