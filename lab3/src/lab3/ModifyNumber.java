/**
*Name: Ramya N
*Description: Modify the accepted number such that each digit in newly formed number is 
equal to the difference between two consecutive digits in the original number.
*Date: 3/19/2021
*/
package lab3;
import java.util.Scanner;
import java.lang.Math;
public class ModifyNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number=sc.nextInt();
		System.out.println("The modified number is: "+modifynumber(number));
	}
	private static int modifynumber(int pNumber)
	{
		String str=Integer.toString(pNumber);
		int output=0;
		for(int i=0;i<str.length()-1;i++)
		{
			int diff=str.charAt(i)-str.charAt(i+1);
			output=output*10+Math.abs(diff);
		}
		output=output*10+(str.charAt(str.length()-1))-48;
		return output;

	}

}
