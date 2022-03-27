package prcode;
import java.util.Scanner;
class Addition
{
   int r;
  void sum(int x, int y)
  {
    r=x+y;
  } 
}
public class NumAdd {
  public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        int a,b;
        System.out.println("Enter 2 numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        Addition p=new Addition();
        p.sum(a,b);
        Addition q=new Addition();
        System.out.println("Enter 2 numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        q.sum(a,b);
        System.out.println("Result with p object is "+p.r);
        System.out.println("Result with q object is "+q.r);
        sc.close();

    }
}