//not done
import java.util.Scanner;

public class PlayWithNumbers {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
    int n,q,num;
    do
    {
    	n=s.nextInt();
    	q=s.nextInt();
    }while(n<1&&q<1&&n>1000000&&q>1000000);
    long ar[]=new long[n];
    for(int i=0;i<n;i++)
    {
    	do
    	{
    	ar[i]=s.nextLong();
    	}while(ar[i]<1&&ar[i]>1000000000);
    }
    for(int j=0;j<q;j++)
    {
    	int l=s.nextInt();
        int r=s.nextInt();
      System.out.println(check(l,r,ar));
    }
	}
static int check(int l,int r,long a[])
{
	int count=0,t1=-1,t2=-1,sum=0;
	for(int i=0;i<a.length;i++)
	{
		if(l==a[i])
		{
			t1=i;
		}
		if(r==a[i])
		{   
			t2=i;
	    }
		if(t1!=-1&&t2!=-1)
		{
			while(t1<=t2)
			{
			count++;
			sum+=a[t1++];
		    }
		}
	}
	if(t1==-1&&t2==-1)
		System.exit(0);
	return sum/count;
}
}