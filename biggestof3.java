package prcode;

import java.util.Scanner;

class Big3
{
	int large (int x,int y, int z)
	{
		if(x>y && x>z)
			return x;
		else if(y>z)
			return y;
		else 
			return z;
	}
}

public class biggestof3 {
	public static void main(String[] args) {
		int a,b,c,r;
		Scanner s=new Scanner(System.in);
				System.out.println("enter the 3 numbers\n");
				a=s.nextInt();
				b=s.nextInt();
				c=s.nextInt();
				Big3 p= new Big3();
				r=p.large(a, b, c);
				System.out.println("biggest of three number is\n"+r);
				
				
				
				
				
		
		
	}

}
