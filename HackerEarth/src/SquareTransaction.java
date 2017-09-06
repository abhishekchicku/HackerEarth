import java.util.Scanner;

public class SquareTransaction {

	public static void main(String[] args) {
	Scanner sn=new Scanner(System.in);
	int n=sn.nextInt();
	int a[]=new int[n];
	int sum=0;
	for(int i=0;i<n;i++)
	{
		a[i]=sum+sn.nextInt();
		sum=a[i];
	}
	int q=sn.nextInt();
	int search=0,ind=-1;
	for(int i=0;i<q;i++)
	{
	search = sn.nextInt();
	for(int j=0;j<n;j++)
	{   ind=-1;
		if(a[j]>=search)
		{
		ind=j+1;
		break;
		}
	}
	System.out.println(ind);
	}
  }
}
