import java.util.*;
public class Pattern6{
    public static void starPattern6(int n)
    {
        int row=1;
        int space=0;
        int star=n;
        while(row<=n)
        {
            int col=1;
            while(col<=space)
            {
                System.out.print(" ");
                col++;
            }
            int cst=1;
            while(cst<=star)
            {
                System.out.print("*");
                cst++;
            }
            System.out.println();
            space++;
            star--;
            row++;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        starPattern6(n);
        sc.close();
    }
}