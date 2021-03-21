/**
*Name: Ramya N
*Description: Convert array list to array.
*Date: 3/17/2021
*/
package lab2;
import java.util.ArrayList;
import java.util.List;
public class ConvertArrayListToArray {

	public static void main(String[] args) {
		ArrayList<Integer> itemList=new ArrayList<>();
		itemList.add(1);
		itemList.add(2);
		itemList.add(3);
		Integer [] arr= new Integer[itemList.size()];
		itemList.toArray(arr);
		System.out.print("Array: ");
		for(int i=0;i<arr.length;i++) {
			if(i==arr.length-1)
				System.out.print(arr[i]);
			else
				System.out.print(arr[i]+",");
		}
		

	}

}
