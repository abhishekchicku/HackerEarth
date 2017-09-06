import java.util.Scanner;

public class SimpleSearch {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++)
		a[i]=s.nextInt();
	int se=s.nextInt();
	for(int i=0;i<n;i++)
	{
		if(se==a[i])
			se=i;
	}
	System.out.println(se);
	}

}
