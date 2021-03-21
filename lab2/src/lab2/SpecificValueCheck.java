/**
*Name: Ramya N
*Description: Check if the array contains a specific value.
*Date: 3/18/2021
*/
package lab2;
import java.util.Scanner;
public class SpecificValueCheck {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of items: ");
		final int numofitems=sc.nextInt();
		System.out.print("Enter the elements of array(separated by space): ");
		int [] arr=new int[numofitems];
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		System.out.print("Enter the value to be checked: ");
		int valueToCheck=sc.nextInt();
		boolean status=false;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==valueToCheck)
			{
				status=true;
				break;
			}
		}
         if(status==true)
        	 System.out.printf("The value %d is there in the array",valueToCheck);
         else 
        	 System.out.printf("The value %d is not there in the array",valueToCheck);
	}

}
