class Solution {
    int countOnes(String str){
        int count=0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='1') count++;
        }
        return count;
    }
    int countZeros(String str){
        int count=0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='0') count++;
        }
        return count;
    }
    public int maxScore(String s) {
        ArrayList<Integer> arr= new ArrayList<>();
        for(int i=1; i<s.length(); i++){
            int l= countZeros(s.substring(0,i));
            int r= countOnes(s.substring(i, s.length()));                
            arr.add(l+r);
        }
        return Collections.max(arr);
    }
}