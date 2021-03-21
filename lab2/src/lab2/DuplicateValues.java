/**
*Name: Ramya N
*Description: Find the duplicated values in an array.
*Date: 3/17/2021
*/
package lab2;
import java.util.Scanner;
public class DuplicateValues {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number of items: ");
		final int numofitems=sc.nextInt();
		System.out.print("Enter the elements of array(separated by space): ");
		int [] arr=new int[numofitems];
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		int count=0;
		String output="";
		System.out.println("Duplicate elements in the given array: ");
		for(int i=0;i<arr.length;i++)
		{
			count=0;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					break;
				}
			}
			if(count==1)
			{
				if(output.contains(Integer.toString(arr[i]))==false)
					output+=Integer.toString(arr[i])+",";
				
			}
		}
System.out.println(output.substring(0,output.length()-1));
	}

}
