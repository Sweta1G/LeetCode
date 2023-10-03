class Solution {
    public int countConsecutive(String color, char ch){
        int count=0;
        for(int i=1; i<color.length()-1; i++){
            if(color.charAt(i-1)==ch && color.charAt(i)==ch && color.charAt(i+1)==ch ) count++;
        }
        return count;
    }
    public boolean winnerOfGame(String colors) {
        int a_count= countConsecutive(colors,'A');
        int b_count= countConsecutive(colors,'B');
        if(a_count>b_count) return true;
        return false;
    }
}