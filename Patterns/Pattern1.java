/*
     input: n=5
     output: *
             *
             *
             *
             *
*/
import java.util.*;
class Pattern1
{
	public static void starPattern1(int n)
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
			row=row+1;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n: ");
		int n=sc.nextInt();
		starPattern1(n);
		sc.close();
	}
}