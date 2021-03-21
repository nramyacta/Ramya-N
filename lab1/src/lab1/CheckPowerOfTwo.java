/**
*Name: Ramya N
*Description: Check the input number is a power of 2 or not.
*Date: 3/16/2021
*/
package lab1;
import java.util.Scanner;
public class CheckPowerOfTwo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number=sc.nextInt();
		System.out.println(checkNumber(number));
		}
		public static boolean checkNumber(int n)
		{
		boolean status=false;
		int i=1,mul=1;
		while(i>0)
		{
		mul*=2;
		if(mul==n)
		{
		status=true;
		break;
		}
		else if(mul>n)
		break;
		i++;
		}
		return status;

	}

}
