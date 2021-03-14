import java.util.Scanner;
public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,j,m=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter an integer to display all the prime numbers up to it: ");
int n=sc.nextInt();
m=n/2;
if(n==0||n==1)
	System.out.println(n+" no prime number below this integer");
	
else
{
for (j=1;j<n;j++) {
for(i=2;i<m;i++) {
	if(n%i==0) {
		System.out.println(n);
			
		}
	}
}
}

}
}