import java.util.Scanner;

public class lifeuniverse {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	    int a=0,b=0,t=0;
	    t=s.nextInt();
	    if(t>10)
	    System.exit(0);
	    for(int o=0;o<t;o++)
	    {
	    	a=s.nextInt();
	    	if(a<1&&a>1000000000)
	        System.exit(0);
	    	b=s.nextInt();
	        if(b<1&&b>1000000000)
	        System.exit(0);
	    for(int i=a;i<=b;i++)
	      if(prime(i))
	    	  System.out.println(i);
		}}
	static Boolean prime(int num)
	{
	     if (num <= 1) return false;
	     if (num % 2 == 0 && num > 2) return false;
	     for(int i = 3; i < num / 2; i+= 2)
	     {
	         if (num % i == 0)
	             return false;
	     }
	     return true;
	}
	}
