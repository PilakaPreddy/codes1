//Program for constructor overloading
package prcode;
import java.util.*;
class Values{
int id;
String name;
Values()  {
id=10;
name="Arun";  
}
Values(int n, String str) {
id=n;
name=str;
}
void display(){
System.out.println("Id is :"+ id+"\nName is:"+name);   }  }
class ConOver{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int number;
String sname;
System.out.println("Enter name");
sname=s.nextLine(); 
System.out.println("Enter ID");
number=s.nextInt();
Values v1=new Values();
Values v2=new Values(number,sname);
v1.display();
v2.display();
}
}