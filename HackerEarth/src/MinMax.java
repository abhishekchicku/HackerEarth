import java.util.Scanner;
public class MinMax {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int[] b=new int[n];
	for(int i=0;i<n;i++)
	 {
		b[i]=s.nextInt();
	 }
	int Smin=0,Smax=0,sum=0,min=b[0],max=b[0];
	for(int i=0;i<n;i++)
	{
		if(min>b[i])
		{
			min=b[i];
		}
		if(max<b[i])
		{
			max=b[i];
		}
	}
	for(int i=0;i<n;i++)
	  sum=sum+b[i];
	Smin=sum-max;
	Smax=sum-min;
	System.out.println(""+Smin+" "+Smax);
//	 sort(b,n);
//	 int min=0,max=0;
//	 for(int i=0;i<n-1;i++)
//	 {
//	   min=min+b[i];
//	   max=max+b[n-i-1];
//	 } 
//	   System.out.print(""+min+"\t"+max);
//	}
//	static void sort(int A[],int n)
//	{
//		for(int i=0;i<n;i++)
//		{
//			for(int j=0;j<n;j++)
//			if(A[i]<A[j])
//			{
//				int temp=A[i];
//				A[i]=A[j];
//				A[j]=temp;
//			}
//		}
	}
 }
