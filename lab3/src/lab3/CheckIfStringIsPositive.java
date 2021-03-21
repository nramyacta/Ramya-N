/**
*Name: Ramya N
*Description: Check a positive string(each character to the right comes after it).
*Date: 3/18/2021
*/
package lab3;
import java.util.Scanner;
public class CheckIfStringIsPositive {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str=sc.next();
		System.out.println(checkifpositive(str));
	}
	private static String checkifpositive(String pStr)
	{
		int count=0;
		String output=" ";
		for(int i=0;i<pStr.length()-1;i++)
		{
			if(pStr.charAt(i)<pStr.charAt(i+1))
				count++;
			else
				break;
		}
		if(count==pStr.length()-1)
			output+="Positive";
		else
			output+="Not positive";
        return output;
	}

}
