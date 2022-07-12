// { Driver Code Starts
// Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        // InputStream.skip();
        while (t-- > 0) {
            String S = read.readLine();
            String oldW = read.readLine();
            String newW = read.readLine();
            Solution ob = new Solution();

            System.out.println(ob.replaceAll(S, oldW, newW));
        }
    }
}// } Driver Code Ends


// User function Template for Java
class Solution {
    static String replaceAll(String str, String oldW, String newW) {
        // code here
        
        String ans = "";
        int len = oldW.length();
        
        for(int i =0; i<str.length(); ){
            
            
            if(i <= str.length() - len)
            {
            if(str.substring(i, i+len).equals(oldW)){
                ans+=newW;
                i+=len;
            }
            else{
                ans+=str.substring(i, i+1);
                i++;
            }
            }
            else{
                ans+=str.substring(i); 
                break;
            }
            
        }
        
        
        // System.out.println(ans);
        return ans;
    }
}