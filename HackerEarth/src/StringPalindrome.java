import java.util.Scanner;
class StringPalindrome {
public static void main(String[] args) {
	Scanner sn=new Scanner(System.in);
	String s="";
	do {
	s=sn.next();
	}
	while(s.length()<1&&s.length()>5);
    StringBuilder ss=new StringBuilder();
    ss.append(s);
    ss.reverse();
    for(int i=0;i<ss.length();i++)
    {
    	if(ss.charAt(i)!=s.charAt(i))
    	{
    		System.out.println("NO");
    	    System.exit(0);
    	}
    		
    }
 System.out.println("YES");
}
}
