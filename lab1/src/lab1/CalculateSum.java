/**
*Name: Ramya N
*Description: Calculate the sum of first n natural numbers which are divisible by 3 or 5.
*Date: 3/16/2021
*/
package lab1;
import java.util.Scanner;
public class CalculateSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int range=sc.nextInt();
		System.out.println("The sum of natural numbers upto "+range+" is: "+calculateSum(range));
		}
		private static int calculateSum(int n)
		{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
		if((i%3==0)||(i%5==0))
		{
		sum+=i;
		}
		}
		return sum;

	}

}
