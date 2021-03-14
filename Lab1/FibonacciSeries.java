import java.util.Scanner;
public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number until which fibonacci series has to be displayed: ");
	int num=in.nextInt();
		// TODO Auto-generated method stub
		int i,t1=0,t2=1,nt;
		for(i=1;i<=num;i++)
		{
		System.out.println(t1);
		nt=t1+t2;
		t1=t2;
		t2=nt;
	}
	}

}
