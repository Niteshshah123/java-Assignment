/* Write a program to calculate the average of number. */

public class qst6 {
    public static void main(String[] args) {
        int numbers[]= {1,2,3,4,5,6,7,8,9,10};
        int sum=0;
        for(int i=0; i<10; i++){
            sum= sum+numbers[i];
        }
        float average= sum/10;
        System.out.println("The average of the number is: "+ average);

    }
}
