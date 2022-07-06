// { Driver Code Starts
import java.util.*;

class MaxLenZeroSumSub
{

    // Returns length of the maximum length subarray with 0 sum

    // Drive method
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            GfG g = new GfG();
            System.out.println(g.maxLen(arr, n));
            T--;
        }
    }
}// } Driver Code Ends


class GfG
{
    int maxLen(int nums[], int n)
    {
        // Your code here
        Map<Integer, Integer> set = new HashMap<Integer, Integer>();
        
        int sum = 0, count = 0;
        
        for(int i =0; i<n; i++){
            sum+= nums[i];
            
            if(nums[i] == 0 && count == 0)
                count = 1;
                
            if(sum == 0)
                count = i + 1;
                
            Integer prev = set.get(sum);
            
            if(prev != null)
                count = Math.max(count, i - prev);
            else
                set.put(sum, i);
        }
        
        return count;
        
        
    }
}