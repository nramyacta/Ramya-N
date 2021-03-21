/**
*Name: Ramya N
*Description: Accept an array of elements and return the second smallest.
*Date: 3/18/2021
*/
package lab2;
//import java.util.*;
public class SecondSmallestElementInArray {
	

	public static void main(String[] args) {
		
		int array[]= {11,5,9,8,20};
		
		System.out.println("Second smallest number: "+getsecsmall(array));}
	

		public static int getsecsmall(int[] array) {
			
		int temp,size;
		size=array.length;
		for(int i=0; i<size; i++) {
			for(int j=i+1; j<size; j++) {
				if(array[i]>array[j]) {
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		
		}
         return array[1];
		}
}	

