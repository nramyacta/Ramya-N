/**
*Name: Ramya N
*Description: Accept a line of integer and then display each integer and sum of all integers.
*Date: 3/18/2021
*/
package lab3;
import java.util.Scanner;
import java.util.StringTokenizer;
public class SumOfIntegers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of items: ");
		final int numofitems=sc.nextInt();
		int sum=0;
		String [] strArr=new String[numofitems];
		System.out.println("Enter the value of the items: ");
		for(int i=0;i<strArr.length;i++)
			strArr[i]=sc.next();
		for(int i=0;i<strArr.length;i++)
			System.out.println(strArr[i]);
		for(int i=0;i<strArr.length;i++)
		{
			sum+=(Integer.parseInt(strArr[i]));
		}
        System.out.println("The sum is: "+sum);
	}

}
