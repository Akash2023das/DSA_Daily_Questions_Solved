/*Counting frequencies of array elements */
import java.util.*;
import java.util.HashMap;
import java.util.Map;
class P0{
    public static void countFrequencyElements(int n, int[] arr){
        HashMap<Integer,Integer> mp=new HashMap<Integer,Integer>();
        for(int i=0; i<n; i++) //traverse the array elements
        {
            if(mp.containsKey(arr[i])) // checks if the element is present in hashmap
            {
                mp.put(arr[i],mp.get(arr[i])+1); // then put into the hashmap with increment the value
            }
            else
            {
                mp.put(arr[i],1);
            }
        }
        // Display Elements
        for(Map.Entry<Integer,Integer> entry:mp.entrySet()){
            System.out.println(entry.getKey()+"="+entry.getValue());
        }

    }
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter array size: ");
       int n=sc.nextInt();
       System.out.print("Enter array elements: ");
       int[] arr=new int[n];
       for(int i=0; i<n; i++)
       {
          arr[i]=sc.nextInt();
       }
       countFrequencyElements(n,arr);
       sc.close();
    }
}