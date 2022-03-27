//Multilevel inheritance
package prcode;

import java.util.Scanner;
class A
{
  int x;
  void setX(int n)
  {
    x=n; 
  }
  void showX()
  {
    System.out.println("x= "+x);
  }
}
class B  extends A

{
  int y;
  void setY(int n)
  {
    y=n;
  }
  void showY()
  {
    System.out.println("y= "+y);
  }
}
class C extends B

{
  int z,s;
  void setZ(int n)
  {
    z=n;
  }
  void showZ()
  {
    System.out.println("Z= "+z);
  }
  void sum()
  {
    s=x+y+z;
  }
  void display()
  {
    showX();
    showY();
    showZ();
    System.out.println("Sum is "+s);
  }
}
public class multilevelinheritance {

  public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    int n1,n2,n3;
    System.out.println("Enter 3 numbers");
    n1=sc.nextInt();
    n2=sc.nextInt();
    n3=sc.nextInt();
    C p=new C();
    p.setX(n1);
    p.setY(n2);
    p.setZ(n3);
    p.sum();
    p.display();
  sc.close();
  }

}