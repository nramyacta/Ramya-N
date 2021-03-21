/**
*Name: Ramya N
*Description: Find the sum of the cubes of the digits of n digit number. 
*Date: 3/15/2021
*/
package lab1;
import java.util.Scanner;
public class CubeSum {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter Number: ");
		int num=in.nextInt();
		int sum=0,d=0;
		while(num!=0)
		{
			d=num%10;
			sum=sum+d*d*d;
			num=num/10;
		}
		System.out.println(sum);

	}

}
