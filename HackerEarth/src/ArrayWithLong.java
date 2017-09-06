import java.util.Scanner;

public class ArrayWithLong {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
    int n;
	do
    {
    	n=s.nextInt();
    }while(n<1&&n>10);
    long A[]=new long[n];
    long sum=0;
    for(int i=0;i<n;i++)
    {
    	A[i]=s.nextLong();
    	sum+=A[i];
    }
    System.out.println(sum);
	}

}
