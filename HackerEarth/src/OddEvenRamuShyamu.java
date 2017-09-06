import java.math.BigInteger;
import java.util.Scanner;

public class OddEvenRamuShyamu {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	    long t;
	    String n;
	    t=s.nextLong();
	    if(t>=1&&t<=100000)
	    {
	    while(t!=0)
	    {
        n=s.next();
        if(n.isEmpty())
         System.exit(0);
	    	if(even(n))
	    	{
	    	System.out.println("YES");
	    	}else
	    	System.out.println("NO");
	    	t--;
	    }
		}}
	 static Boolean even(String n)
	 {int i=Integer.parseInt(n);
		 if((i&01)==0)
			 return true;
		 else
			 return false;
	 }
	}
