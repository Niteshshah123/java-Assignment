// Design a number Gussing game in java.

import java.util.Random;
import java.util.Scanner;
class GuessGame{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in); 
      Random rand = new Random();
      String play="yes"; 
      int randomno;
      int userNum;
      int tries;

      while(play.equals("yes")){
      randomno= rand.nextInt(101);
      tries=0;
    
    do{
        System.out.println("Guess the no. between 0 to 100");
        userNum= sc.nextInt();
        tries ++;

        if (userNum==randomno) {
            System.out.println("Congulation! you Guess the correct no. in "+tries +"tries.");
        }
        else if(userNum<randomno){
            System.out.println("Opps! your no. is smaller. Try Again");
        }
        else{
            System.out.println("Opps! your no. is Greater. Try Again");
        }
    } while(userNum!= randomno);
    System.out.println("Do you want to play again? yes/ no");
    play=sc.next().toLowerCase();
    }
    System.out.println("Thanks for playing."); 
    }
       
}