import java.util.HashMap;
import java.util.Collection;
import java.util.Map;
class Solution {
    
    public int reverse(int n){
        int temp=n, rev=0, r=0;
        while(temp>0){
            r= temp%10;
            rev= rev*10+r;
            temp/= 10;
        }
        return rev;
    }
    public int countNicePairs(int[] nums) {
        Map<Integer, Integer> numbers = new HashMap<>();

        for (int num : nums) {
            int temp = num - reverse(num);

            if (numbers.containsKey(temp))
                numbers.put(temp, numbers.get(temp) + 1);
            else 
                numbers.put(temp, 1);
        }

        long pairs = 0;
        Collection<Integer> values = numbers.values();
        int mod = 1000000007;
        for (int value : values) {
            pairs = (pairs % mod + ((long) value * ((long) value - 1) / 2)) % mod;
        }
        return (int) pairs;
    }
}