import java.util.Scanner;

public class Parentclass {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Parentclass pc = new Parentclass();
        ChildClass cc= new ChildClass();
        System.out.println(cc.hello("hello"));
    }

    float Add(int a, int b){
        return a+b;
    }
    //method overloading
    float Add(int a, int b, int c){
        return a+b+c;
    }
    //method overloading
    float Add(float a, int b){
        return a+b;
    }
    String hello(String a){
        return "hello world from parent class";
    }
}
