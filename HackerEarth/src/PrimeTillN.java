import java.util.Scanner;

public class PrimeTillN {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int N=s.nextInt();
	Boolean b1=false;
	for(int i=2;i<=N;i++)
	{
		b1=prime(i);
	    if(b1==true)
	    
	    System.out.println(i);
	    
	}
	}
static Boolean prime(int i)
{int m=i/2;
	for(int j=2;j<=m;j++)
	{
		if(i%j==0)
			return false;
	}
	return true;
}
}
