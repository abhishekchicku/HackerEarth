import java.util.Scanner;

public class MonkTakesAWalk {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int t=s.nextInt();
	int count=0;
	char c[]={'a','e','i','o','u','A','E','I','O','U'};
	for(int i=0;i<t;i++)
	{
		count=0;
		String sn=s.next();
	    for(int j=0;j<sn.length();j++)
	    {
	       for(int l=0;l<c.length;l++)
	    if(sn.charAt(j)==c[l])
		{
	    	count++;	
	    }
	    	
	      }
	    System.out.println(count);
	    }
	
	}
}
