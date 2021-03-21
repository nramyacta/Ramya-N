/**
*Name: Ramya N
*Description: Find the length of longest consecutive element sequence in the array.
*Date: 3/17/2021
*/
package lab2;
import java.util.HashSet;
public class LengthOfLongestConsecutiveElementSequence {

	public static void main(String[] args) {
		int nums[]= {49,1,3,200,2,4,70,5};
		System.out.println("Actual length of array: "+nums.length);
		System.out.print("array elements: ");
		for(int i=0; i< nums.length; i++)
		{
			System.out.println(nums[i]+" ");
		}
	System.out.println("the new length of array: "+longest_sequ(nums));

	}
public static int longest_sequ(int[] nums) {
	final HashSet<Integer> h_set=new HashSet<Integer>();
	for(int i : nums) h_set.add(i);
	int longest_seq_len=0;
	for(int i : nums) {
		int length=1;
		for (int j=i-1; h_set.contains(j); --j) {
			h_set.remove(j);
			++length;
		}
		for(int j=i+1; h_set.contains(j); ++j) {
			h_set.remove(j);
			++length;
		}
		longest_seq_len =Math.max(longest_seq_len,  length);
	}
return longest_seq_len;

	}

}
