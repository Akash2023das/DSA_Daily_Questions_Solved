import java.util.Scanner;

public class Pattern8 {
    public static void starPattern8(int n)
    {
        int row=1;
        int space=1;
        int star=n/2;
        int rn=n/2;
        while(row<=n)
        {
            //for printing star
            int col=1;
            while(col<=star){
                System.out.print("*");
                col++;
            }

            //for printing spaces
            int csp=1;
            while(csp<=space){
                System.out.print(" ");
                csp++;
            }

            //for printing star
            int cst=1;
            while(cst<=star)
            {
                System.out.print("*");
                cst++;
            }
            
            //preparation part
            System.out.println();
            if(row<=rn){
                star--;
                space=space+2;
            }
            else{
                star++;
                space=space-2;
            }
            row++;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        starPattern8(n);
        sc.close();
    }
}
