import java.util.Scanner;

public class animal {
    Scanner sc = new Scanner(System.in);
    String color;
    void getColor(){
        color= sc.nextLine();
    }
    void setColor(){

    }
    void eat(){
        System.out.println("Animals eats");
    }
    void commonanimal(){
        System.out.println("It has 4 legs");
    }
}
