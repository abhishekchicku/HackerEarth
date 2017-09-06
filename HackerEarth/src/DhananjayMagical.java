//UPLOAD ISSUE
import java.io.DataInputStream;
import java.io.IOException;
public class DhananjayMagical {

	//public static void main(String[] args) {
/*	Scanner s=new Scanner(System.in);
	int t;
	int n;
	String c;
	char m = 0;
	do
	{   t=s.nextInt();
	    n=s.nextInt();
		c=s.next();
	}while(n<1&&n>500&&t<0&&t>100&&c.length()<1&&c.length()>500);
	int ascii=0,tel=0;
	for(int i=0;i<n;i++)
	{
		ascii=c.charAt(i);
		tel=ascii;
		if(prime(tel))
		{
			m=(char) (m+(char)tel);
			System.out.append(m);
		}
		else
		{
			int asc=0;
			int temp1=ascii,count1=1,count=1,temp=ascii;
			while(!prime(temp1)&&!prime(temp))
			{        
			     if(!prime(++temp1))
			    	 count++;
			     if(!prime(--temp)) 
			    	 count1++;
			}
			if(count>count1)
		         asc=temp;
		    if(count==count1)
		    {
		    	if(temp1>temp)
		    	 asc=temp;
		    	else
		    	 asc=temp1;
		    }
		    if(count<count1)
		    	 asc=temp1;
		    else
		    asc=temp;
		    m=(char) (m+(char)asc);
		  System.out.append(m);
		
		}
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
*/
		public static void main(String args[] )throws IOException{
			DataInputStream s=new DataInputStream(System.in);
			int t;
			int n;
			String c;
			do
			{   t=Integer.parseInt(s.readLine());
			    n=Integer.parseInt(s.readLine());
				c=s.readLine();
			}while(n<1&&n>500&&t<0&&t>100&&c.length()<1&&c.length()>500);
			
			int ascii=0;
			int tel;
			for(int i=0;i<n;i++)
			{
				ascii=c.charAt(i);
				tel=ascii;
		       if(prime(tel))
		        {
					System.out.printf("%c",tel);
				}
				else
				{
					int asc=0;
					int temp1=ascii,count1=1,count=1,temp=ascii;
					while(!prime(temp1)&&!prime(temp))
					{        
					     if(!prime(++temp1))
					    	 count++;
					     if(!prime(--temp)) 
					    	 count1++;
					}
					if(count>count1)
				         asc=temp;
				    if(count==count1)
				    {
				    	if(temp1>temp)
				    	 asc=temp;
				    	else
				    	 asc=temp1;
				    }
				    if(count<count1)
				    	 asc=temp1;
				    else
				    asc=temp;
				  System.out.printf("%c",asc);
				
				}
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