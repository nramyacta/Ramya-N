/**
*Name: Ramya N
*Description: Create mirror image of string. and return original and reversed.
*Date: 3/19/2021
*/
package lab3;
import java.util.Scanner;
public class MirrorOfString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str=sc.next();
		System.out.println(getImage(str));
	}
	private static String getImage(String pStr)
	{
		StringBuffer reverseStr=new StringBuffer(pStr);
	    reverseStr.reverse();
		return pStr+"|"+reverseStr;
	}

}
