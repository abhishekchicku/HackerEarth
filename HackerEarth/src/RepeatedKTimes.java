import java.util.Scanner;

public class RepeatedKTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int A[]=new int[n];
      for(int i=0;i<n;i++)
      {
    	  A[i]=s.nextInt();
    	  
      }
      int t=s.nextInt();
      int l=check(A,n,t);
      int track=0;
      while(c!=t)
      {
      if(c==t)
      {   track=track+1;
    	  System.out.println(track);
    	  break;
	  }
      else
      {   t=t+1;   
    	  c=check(A,n,t);
      }  
      }
     }
 static int check(int A[],int n,int t)
 {
	 int c=0;
     for(int i=0;i<n;i++)
     {
   	  if(t==A[i])
   		  c++;
     }
     return c;
 }
}
