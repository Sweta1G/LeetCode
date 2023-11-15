class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        if(arr.length==1) return 1;
        Arrays.sort(arr);
        
        arr[0]=1;
        for(int i=1; i<arr.length; i++){
            int temp= arr[i-1]- arr[i];
            if(Math.abs(temp)<=1) continue;
            else{
                arr[i]= arr[i-1]+1;
            }
        }
        return arr[arr.length-1];
    }
}