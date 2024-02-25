/*Write a java program that takes a number as input and print its fibonacci series. */
import java.util.Scanner;
public class qst5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the count of serise: ");
        int count= sc.nextInt();
        int a=0;
        int b=1;
        int c;
        System.out.println("The fibonanci series are: ");
        System.out.println("0 ");
        System.out.println("1 ");
        for(int i=0; i<count; i++){
            c= a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}
