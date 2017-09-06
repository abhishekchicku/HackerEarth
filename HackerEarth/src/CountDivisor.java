import java.util.Scanner;
public class CountDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sn=new Scanner(System.in);
    int l,r,k,count=0;
    l=sn.nextInt();
    r=sn.nextInt();
    k=sn.nextInt();
    for(int i=l;i<=r;i++)
    	if(i%k==0)
    		count++;
    System.out.println(count);
	}
      
}
