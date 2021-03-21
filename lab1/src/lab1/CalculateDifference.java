/**
*Name: Ramya N
*Description: Find the difference between sum of squares and square of sum of first n natural numbers.
*Date: 3/16/2021
*/
package lab1;
import java.util.Scanner;
import java.lang.Math;
public class CalculateDifference {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		System.out.println("The sum is: "+calculateDifference(num));
		}
		private static int calculateDifference(int n)
		{
		int sum=0;
		int sumofnum=0,sumofsquares=0;
		sumofnum=(n*(n+1)/2);
		sumofsquares=((n*(n+1)*(2*n+1))/6);
		sum=(sumofnum*sumofnum)-sumofsquares;
		return sum;

	}

}
