class Solution {
    
    public int[] maxSlidingWindow(int[] arr, int k) {
        if(k==1) return arr;
        int n= arr.length;
        int res[]= new int[n-k+1], l=0;
        Deque<Integer> dq= new ArrayDeque();
        int i=0, j=0;
        while (j<n) {
            if(dq.size()==0) dq.offerLast(arr[j]);
            else{
                while(dq.size()!=0 && dq.peekFirst()<arr[j]) dq.pollFirst();
                while(dq.size()!=0 && dq.peekLast()<arr[j]) dq.pollLast();
                dq.offerLast(arr[j]);
            }
            if(j-i+1==k){
                if(l<res.length)
                    res[l++]= dq.peekFirst();
                if(arr[i]==dq.peekFirst()) dq.pollFirst();
                i++; 
            }
            // dq.offerLast(arr[j]);
            j++;
        }

        return res;
    }
    // 7 2 4--2====> 7 4
}