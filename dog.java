import java.util.Scanner;
public class dog extends animal {
    Scanner sc = new Scanner(System.in);
    String owner;
    String getOwner(){
        owner = sc.nextLine();
        return owner;
    }
    String setOwner(String owner){

        return "a";
    }
    void eat(){
        System.out.println("Dogs eat meat");
    }
    void bark(){
        System.out.println("dogs barks");
        super.commonanimal();
    }
}
