class Solution {
    public int integerBreak(int n) {
        Map<Integer, Integer> cache = new HashMap();
        for(int i = 1; i<=n; i++)
            cache.put(i,i);
        cache.put(n,0);
        for(int num =2; num<=n; num++){
            for(int left = 1; left< num; left++){
                int val = cache.get(left) * cache.get(num-left);
                cache.put(num, Math.max(cache.get(num), val));
            }
        }
        return cache.get(n);
    }
}