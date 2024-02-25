import java.util.Scanner;
public class lion extends animal {
    Scanner sc = new Scanner(System.in);
    String jungleName;
     String getJungle(){
        jungleName= sc.nextLine();
        return jungleName;
     }
     String setJungle(){

        return "a";
     }
     void eat(){
        System.out.println("lion eats");
     }
     void roar(){
        System.out.println("lion roars.");
        super.commonanimal();
     }
}
