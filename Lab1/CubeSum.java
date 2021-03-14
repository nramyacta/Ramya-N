import java.util.Scanner;
public class CubeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);
System.out.print("Enter Number: ");
int num=in.nextInt();
int sum=0,d=0;
while(num!=0)
{
	d=num%10;
	sum=sum+d*d*d;
	num=num/10;
}
System.out.println(sum);
	}

}
