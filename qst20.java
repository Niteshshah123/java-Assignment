/*Write a java program to insert a word in the middle of another string. */

import java.util.Scanner;
public class qst20 {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the string"); 
      String orig=sc.nextLine(); 
      System.out.println("Enter the word to be insert");
      String inserted=sc.nextLine(); 
      int midpoint= orig.length()/2;
      String newStr=orig.substring(0, midpoint)+inserted+orig.substring(midpoint);
      System.out.println("The inserted string is:"+ newStr);
    }
}
