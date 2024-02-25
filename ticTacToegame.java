import java.util.Scanner;
public class ticTacToegame {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      boolean playagain;
      char player='x';
      int row;
      int col;
      char gameLetter[][]= new char[3][3];
        
        do{ 
            String gameover ="No";

            for(int i=0; i<3; i++){
                for(int j=0; j<3; j++){
                    gameLetter[i][j]=' ';
                }
            }
            for(int i=0; i<3; i++){
                for(int j=0; j<3; j++){
                    System.out.print( gameLetter[i][j]);
                    System.out.print("|");
                }
                System.out.println("");
            }

            for(int k=0; k<9; k++){
                System.out.println("player "+player+" Enter the index:-");
                row= sc.nextInt()-1;
                col= sc.nextInt()-1;

               while(row>2 ||row<0 ||col<0|| col>2){
                System.out.println("please enter the valid index!");
                row= sc.nextInt()-1;
                col= sc.nextInt()-1;
               }

               while(gameLetter[row][col]!=' '){
                System.out.println("please enter the empty index!");
                row= sc.nextInt()-1;
                col= sc.nextInt()-1;
               }

               if(gameLetter[row][col]==' '){
                    gameLetter[row][col]=player;

                    //printing the value
                    for(int i=0; i<3; i++){
                        for(int j=0; j<3; j++){
                            System.out.print( gameLetter[i][j]);
                            System.out.print("|");
                        }
                        System.out.println("");
                    }
                    for(int a=0; a<3; a++){
                            if((gameLetter[a][0]==player && gameLetter[a][1] ==player && gameLetter[a][2]==player) ||
                            (gameLetter[0][a]==player && gameLetter[1][a] ==player && gameLetter[2][a]==player)||
                            (gameLetter[0][0]==player && gameLetter[1][1] ==player && gameLetter[2][2]==player)||
                            (gameLetter[0][2]==player && gameLetter[1][1] ==player && gameLetter[2][0]==player))
                            {
                                System.out.println("Congratulation! player "+ player+" Won");
                                gameover= "yes";
                                break;
                            }
                    }
                    if(gameover.equals("yes")){
                        break;
                    }

                    if(player=='x')
                    {
                        player='0';
                    }
                    else
                    {
                    player='x';
                    }
                }
                if(k==8){
                    System.out.println("Game tied!!...");
                }

            }


            System.out.println("Do you want to play again? yes/no");
            String userchoice = sc.next();
            if (userchoice.equals("yes")) {
                playagain=true;
            }
            else{
                playagain=false;
            }
        }while(playagain);
        System.out.println("Thanks for playing!!");
    }
}
