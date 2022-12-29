/*
      input: n=5
	  output: *
	          * *
			  * * *
			  * * * *
			  * * * * *
*/
import java.util.*;
class Pattern3
{
	public static void starPattern3(int n)
	{
		int row=1;
		int star=1;
		while(row<=n)
		{
			int col=1;
			while(col<=star)
			{
				System.out.print("*");
				col++;
			}
			System.out.println();
			star=star+1;
			row++;
		}	
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n: ");
		int n=sc.nextInt();
		starPattern3(n);
		sc.close();
	}
}