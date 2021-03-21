/**
*Name: Ramya N
*Description: Accept an integer and print all the prime numbers up to that integer.
*Date: 3/15/2021
*/
package lab1;
import java.util.Scanner;
public class PrimeNumbers {

	public static void main(String[] args) {
		int p;
		System.out.println("Enter an integer to display all the prime numbers up to it: ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num==0||num==1)
			System.out.println(" No prime number below this integer");
			
		else
		{
		for (int i=2;i<=num;i++) {
			p=1;
		for(int j=2;j<i;j++) {
			if(i%j==0) {
				p=0;
			}
		}
		    if(p==1)
				System.out.println("Prime: "+i);
		}
		
		
	}

}
}