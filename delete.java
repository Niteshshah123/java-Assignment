import java.util.Scanner;
public class delete {

    public static double calculateDistance(int x1, int y1, int x2, int y2) {
        double c= Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        return c;
    }

    public static void main(String[] args) {
      /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner sc = new Scanner(System.in);
      double totaldistance = 0;
      double mindistance;
      int ax, ay, bx, by, tx, ty;
  
      ax = sc.nextInt();
      ay = sc.nextInt();
      bx = sc.nextInt();
      by = sc.nextInt();
      tx = sc.nextInt();
      ty = sc.nextInt();
  
      int n = sc.nextInt();
      int i = 0;
  
      while (i < n) {
        int px, py;
        px = sc.nextInt();
        py = sc.nextInt();
  
        double naresh_distance = calculateDistance(ax, ay, px, py);
        double sangeet_distance = calculateDistance(bx, by, px, py);
  
        if (naresh_distance < sangeet_distance) {
          mindistance = naresh_distance + calculateDistance(px, py, tx, ty);
        } else {
          mindistance = sangeet_distance + calculateDistance(px, py, tx, ty);
        }
  
        totaldistance += mindistance;
        i++;
      }
  
      System.out.println(totaldistance);
    }
  }
  