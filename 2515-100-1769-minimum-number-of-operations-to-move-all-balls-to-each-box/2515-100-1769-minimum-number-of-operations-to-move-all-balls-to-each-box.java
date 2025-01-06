class Solution {
    public int[] minOperations(String boxes) {
        int n= boxes.length();
        int arr[]= new int[n], res[]= new int[n];
        for(int i=0;i<n;i++)
            arr[i]= boxes.charAt(i)-'0';
        int oneLeft=0, currLeft=0;
        int oneRight=0, currRight=0;
        int i=0, j=n-1;
        while(i<n && j>=0){
            res[i]+= currLeft;
            oneLeft+= arr[i];
            currLeft+= oneLeft;
            i++;

            res[j]+= currRight;
            oneRight+= arr[j];
            currRight+= oneRight;
            j--;
        }
        return res;
    }
}