//not done


import java.util.Scanner;
import java.util.StringTokenizer;

public class MannaFirstLetter {

	public static void main(String[] args) {
	Scanner sn=new Scanner(System.in);
	
    int t=sn.nextInt();
    //char c;
    for(int i=0;i<t;i++)
   {
    	String sub="SUVO",jit="SUVOJIT";	
    	String s=sn.next();
    	int c=0,m=0;
    	StringTokenizer st=new StringTokenizer(s);
    	if(st.equals(sub))
    	{
              c++;
        }
    	if(st.equals(jit))
    		m++;
    	System.out.println(""+c+m);
	}                     
	}
}
