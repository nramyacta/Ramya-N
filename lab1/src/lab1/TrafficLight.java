/**
*Name: Ramya N
*Description: Simulate a traffic light.
*Date: 3/15/2021
*/
package lab1;
import java.util.Scanner;
public class TrafficLight {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Select the light 1 or 2 or 3: ");
		int num=sc.nextInt();
		if(num==1)
			System.out.println("Stop");
			else if(num==2)
				System.out.println("Go");
			else if(num==3)
				System.out.println("Ready");

	}

}
