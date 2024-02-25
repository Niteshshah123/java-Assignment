/*Write a java program to reverse a string */

import java.util.Scanner;
public class qst14 {
    public static void main(String[] args) {
        System.out.println("Enter the String");
        Scanner sc= new Scanner(System.in);
        String name= sc.next(); // only a string to reverse
        int a= name.length();
        String rev= "";
        for(int i=(a-1); i>=0; i--){
            rev= rev+name.charAt(i);
        }
        System.out.println("The reverse of the number is: "+rev);
    }
}
