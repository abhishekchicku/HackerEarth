import java.util.Scanner;
public class StringUpperLower {

	public static void main(String[] args) {
	Scanner sn=new Scanner(System.in);
	String s="";
	do
	{
	s=sn.next();
	}while(s.length()<1&&s.length()>100);
	String f="";
    for(int i=0;i<s.length();i++)
    {
    	char ch=s.charAt(i);
    	if(Character.isUpperCase(ch))
   	    {
    		f=f+Character.toLowerCase(ch);
    	}
    	else
    	f=f+Character.toUpperCase(ch);
    	
    }
    System.out.println(f);
	}

}
