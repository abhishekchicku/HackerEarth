import java.util.Scanner;

public class PabloString {

	public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int t=s.nextInt();
    if(t<1&&t>100000)
    	System.exit(0);
    while(t!=0)
    {
    int n=s.nextInt();
    if(n<1&&n>100000)
    System.exit(0);
    int A[]=new int[n];
    for(int i=0;i<n;i++)
    {
    	A[i]=s.nextInt();
        if(A[i]<1&&A[i]>1000000)
        	System.exit(0);
    }
   int sum1=0,sum2=0,diff=0;
    int j=0,l=0;
    for(j=0;j<n;)
    {
    	sum1+=A[j];
    	j+=2;
    }
    for(l=1;l<n;)
    {
    	sum2+=A[l];
    	l+=2;
    }
    diff=sum1-sum2;
    if(diff<0)
    	diff=-diff;
    System.out.println(diff);
    t--;
	}
	}
}
