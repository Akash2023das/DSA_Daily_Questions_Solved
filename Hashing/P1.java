
// Check if a pair exists with given sum in given array
import java.util.HashSet;
import java.util.Scanner;

public class P1 {
    public static boolean pairSum(int n, int[] arr, int sum) 
    {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < n; i++)
         {
            int temp = sum - arr[i];
            if (set.contains(temp)) 
            {
                return true;
            }
            set.add(arr[i]);// if not exist in set then add the array element to the set

        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        System.out.println("Enter array elements: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter sum to check: ");
        int sum = sc.nextInt();
        if (pairSum(n, arr, sum)) 
        {
            System.out.println("Yes");
        } 
        else 
        {
            System.out.println("No");
        }
        sc.close();
    }

}
