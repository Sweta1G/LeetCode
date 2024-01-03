class Solution {
    int countOne(String s){
        int count=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='1') count++;
        }
        return count;
    }
    public int numberOfBeams(String[] bank) {
        // int[] arr= new int[bank.length];
        List<Integer> arr= new ArrayList<>();
        
        for(int i=0; i<bank.length; i++){
            int lol= countOne(bank[i]);
            if(lol!=0) arr.add(lol);
        }
        if(arr.size()==0) return 0;
        
        int count=0;
        for(int i=1; i<arr.size(); i++){
            count+= arr.get(i-1)*arr.get(i);
        }
        return count;
    }
}