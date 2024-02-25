/*Write a java program to accept an integer and count the factors of the number. */

import java.util.Scanner;
public class qst18 {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      int sum=0;
      System.out.println("Enter the number");
      int number= sc.nextInt();
      System.out.println("The Factorial of the number are: ");
      for(int i=1; i<=number; i++){
        if(number%i==0){
          sum++;
            System.out.println("+"+i);
            System.out.println("-"+i);
        }
      } 
      System.out.println("The count of factor of given number are: "+(sum*2)); 
    }
}
