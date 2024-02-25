public class deletye {
    int a, b,c;

    deletye(int x, int y, int z){
        a=x;
        b=y;
        c= z;
    }
    public void compare(){
        if (a>b && a>c) {
            System.out.println(a+"is greater");
        }
        else if (b>a && b>c) {
            System.out.println(b+"is greater");
        }
        else if (c>b && c>a) {
            System.out.println(c+"is greater");
        }
        
        else{
            System.out.println("The no. are equal");
        }
    }

    public static void main(String[] args) {
      deletye d= new deletye(4, 2, 4);
      d.compare();  
    }
}
