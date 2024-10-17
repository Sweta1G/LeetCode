class Solution {
    public int maximumSwap(int num) {
//         char[] nums = Integer.toString(num).toCharArray();
//         int n= nums.length;
//         int maxIdx= n-1;
//         int left= -1, right=-1;
//         for(int i=n-2; i>=0; i--){
//             if(nums[i]>nums[maxIdx])
//                 maxIdx= i;
//             else {
//                 left= i;
//                 right= maxIdx;
//             }
//         }
//         if(left==-1) return num;
//         char t= nums[left];
//         nums[left]= nums[right];
//         nums[right]= t;
        
//         return Integer.parseInt(new String(nums));
         char[] numStr = Integer.toString(num).toCharArray();
        int n = numStr.length;

        int maxIdx = n - 1;
        int leftIdx = -1, rightIdx = -1;

        for (int i = n - 2; i >= 0; --i) {
            if (numStr[i] > numStr[maxIdx]) {
                maxIdx = i;
            } else if (numStr[i] < numStr[maxIdx]) {
                leftIdx = i;
                rightIdx = maxIdx;
            }
        }

        if (leftIdx == -1) return num;
        char temp = numStr[leftIdx];
        numStr[leftIdx] = numStr[rightIdx];
        numStr[rightIdx] = temp;

        return Integer.parseInt(new String(numStr));
    }
}
// 72376
// 77326