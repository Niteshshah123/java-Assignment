import java.util.Scanner;

public class ChildClass extends Parentclass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ChildClass cc =new ChildClass();
        Parentclass pc = new Parentclass();
        System.out.println(cc.Add(5, 06));
        System.out.println(pc.Add(6, 7));
        System.out.println(cc.hello("hello"));        
    }
    //method overriding
    @Override
    float Add(int a, int b){
        return a+b;
    }
    
}
