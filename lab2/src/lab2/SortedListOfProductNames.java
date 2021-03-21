/**
*Name: Ramya N
*Description: Display the sorted list of products name.
*Date: 3/18/2021
*/
package lab2;
import java.util.Scanner;
public class SortedListOfProductNames {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of items: ");
		final int numofitems=sc.nextInt();
		System.out.print("Enter the elements of array(separated by space): ");
		int [] arr=new int[numofitems];
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		int temp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);

	}

}
