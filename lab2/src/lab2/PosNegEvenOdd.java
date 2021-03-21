/**
*Name: Ramya N
*Description: Take 20 integer inputs and count total number of positive, negative, even, odd, zero numbers.
*Date: 3/17/2021
*/
package lab2;
import java.util.Scanner;
public class PosNegEvenOdd {

	public static void main(String[] args) {
		int i,x,a[]=new int[20];
		int n=0,p=0,o=0,e=0,z=0;
		Scanner input =new Scanner(System.in);
		for(i=0;i<20;i++)
		{
			System.out.println("Enter Number: ");
			a[i]=input.nextInt();
		}
		for(i=0;i<20;i++)
		{
			if(a[i]<0)
			n++;
			else
				p++;
			x=a[i]%2;
			if(x==0)
				e++;
			else
				o++;
			if(a[i]==0)
				z++;
		}
		
System.out.println("Positive Numbers: "+p);
System.out.println("Negative Numbers: "+n);
System.out.println("Even Numbers: "+e);
System.out.println("Odd Numbers: "+o);
System.out.println("Zero Numbers: "+z);

	}

}
