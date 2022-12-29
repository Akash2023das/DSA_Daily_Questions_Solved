/*
          input: n=5
          output:  * * * * *
                   * * * * 
                   * * * 
                   * *
                   * 
 */
import java.util.*;
public class Pattern4 {
    public static void starPattern4(int n)
    {
        int row=1;
        int star=n;
        while(row<=n)
        {
            int col=1;
            while(col<=star)
            {
                System.out.print("*");
                col++;
            }
            System.out.println();
            star--;
            row++;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=sc.nextInt();
        starPattern4(n);
        sc.close();
    }
}
