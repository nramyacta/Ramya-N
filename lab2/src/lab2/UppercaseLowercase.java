/**
*Name: Ramya N
*Description: Sort the string objects in alphabetical order and make it uppercase to the left 
and lower case to the right.
*Date: 3/18/2021
*/
package lab2;
import java.util.Arrays;
import java.util.Scanner;
public class UppercaseLowercase {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the length of string array: ");
	final int numofitems=sc.nextInt();
	int rangeofcases=0;
	String [] items=new String[numofitems];
	System.out.println("Enter the value of items of string array: ");
	for(int i=0; i<items.length; i++)
		items[i]=sc.next();
	System.out.println(sortStrings(numofitems, items));
	}
    private static String sortStrings(final int pnumofitems, String[] str) {
    	int rangeofcases;
    	String output="";
    	for(int i=0;i<str.length-1;i++)
    	{
    		for(int j=i+1;j<str.length;j++)
    		{
    			if(str[i].compareToIgnoreCase(str[j])>0)
    			{
    				String temp=str[i];
    				str[i]=str[j];
    				str[j]=temp;
    				
    			}
    		}
    	}
    	//sorting the array
    	if(pnumofitems%2==0)
    		rangeofcases=pnumofitems%2;
    	else
    		rangeofcases=pnumofitems/2+1;
    	for(int i=0;i<rangeofcases;i++)
    	{
    		output+=str[i].toUpperCase()+"";
    	}
    	for(int i=rangeofcases;i<pnumofitems;i++)
    	{
    		if(i!=pnumofitems-1)
    		output+=str[i].toLowerCase()+"";
    		else
    			output+=str[i].toLowerCase();
    	}
    	return output;
    		}
    			
    	
    }


