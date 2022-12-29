import java.util.Scanner;

public class Pattern9 {
    public static void starPattern9(int n){
        int row=1;
        int rn=n;
        int space=n/2;
        int star=1;
        while(row<=n){
            //printing space
            int col=1;
            while(col<=space){
                System.out.print(" ");
                col++;
            }
            //printing star
            int cst=1;
            while(cst<=star){
                System.out.print("*");
                cst++;
            }
            //printing space
            int csp=1;
            while(csp<=space){
                System.out.print(" ");
                csp++;
            }
            System.out.println();
            if(row<=rn/2){
                space--;
                star=star+2;                
            }
            else{
                space++;
                star=star-2;
            }
            row++;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        starPattern9(n);
        sc.close();        
    }
}
