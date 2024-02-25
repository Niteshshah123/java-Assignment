import java.util.Random;
import java.util.Scanner;
public class rpsGame {
    public static void main(String[] args) {
        Random rn= new Random();
        Scanner sc= new Scanner(System.in);
        String arr[]={"rock", "paper", "scissor"};
        boolean cond =true;

        while (cond) {
            System.out.println("Choose among rock, paper and scissor.");
            String userinput = sc.nextLine().toLowerCase();
            int randomIndex = rn.nextInt(3);
            String computerchoice = arr[randomIndex];
            System.out.println("computer choice : "+ computerchoice);
            if (userinput.equals("scissor") && computerchoice.equals("paper")
             || userinput.equals("paper") && computerchoice.equals("rock")
             || userinput.equals("rock") && computerchoice.equals("scissor")) {
                System.out.println("congratulation! you win the game.");
            }
            else if(userinput.equals(computerchoice)){
                System.out.println("Game tied.");
            }
            else{
                System.out.println("sorry! you lose");
            }


            System.out.println("Do you want to play again? yes/no");
            String userreturn = sc.nextLine();
            if (userreturn.equals("yes")) {
                cond = true;
            }
            else{
                cond = false;
            }
        }
        System.out.println("Thanks for playing.");
    }
}


