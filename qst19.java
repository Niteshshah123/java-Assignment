/*Write a java program to convert a string into lower case. */

import java.util.Scanner;
public class qst19 {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter the String");
       String name= sc.nextLine();
       int A=(int)'A';
       int a= (int)'a';
       int len= name.length();
       String lower="";
       char chr;
       int temp;
       for(int i=0; i<len; i++){
        chr=name.charAt(i);
        temp= (int) chr;
        if(temp<a){
            temp=temp+(a-A);
            chr=(char) temp;
        }
        //lower=lower+String.valueOf(temp);
        lower=lower+chr;
       }
       System.out.println("The lower case of the string is: "+ lower);
       
    }
}

