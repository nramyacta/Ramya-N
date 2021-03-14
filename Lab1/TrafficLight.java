import java.util.Scanner;
public class TrafficLight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Select the light: ");
int num=sc.nextInt();
if(num==1)
	System.out.println("Stop");
	else if(num==2)
		System.out.println("Go");
	else if(num==3)
		System.out.println("Ready");
	}

}
