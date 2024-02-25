/*Write a java program to accept a number and check whether it is even or not.
   Print 1 if the number is even,0 is the number is odd. */
   
import java.util.Scanner;
public class qst17 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num= sc.nextInt();
        if(num%2==0){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
    }
}
