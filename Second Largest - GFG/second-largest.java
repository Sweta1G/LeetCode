//{ Driver Code Starts
//Initial Template for Java



import java.util.stream.Collectors; 
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().print2largest(arr, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    int remove(int arr[], int n){
        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n - 1; i++)
            if (arr[i] != arr[i + 1]) temp[j++] = arr[i];
        temp[j++] = arr[n - 1];
 
        // Modify original array
        for (int i = 0; i < j; i++)
            arr[i] = temp[i];
 
        return j;
    }
    int print2largest(int arr[], int n) {
        if(n==2) return Math.max(arr[0], arr[1]);
        int count=0;
        Arrays.sort(arr);
        for(int i=1; i<n; i++)
            if(arr[i-1]==arr[i]) count++;
        if(count==n-1) return -1;
        int x= remove(arr,n);
        
        return arr[x-2];
    }
}