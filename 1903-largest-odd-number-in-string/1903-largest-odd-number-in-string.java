class Solution {
    public boolean isOdd(char x){
        if(x=='1' || x== '3' || x=='5' || x=='7' || x=='9') return true;
        return false;
    }
    public boolean isEven(char x){
        if(x=='0' || x== '2' || x=='4' || x=='6' || x=='8') return true;
        return false;
    }
    public String largestOddNumber(String num) {
        if(isOdd(num.charAt(num.length()-1))) return num;
        
        StringBuilder sb= new StringBuilder(num);
        // sb.append(num);
        for(int i= num.length()-1; i>=0; i--){
            if(isEven(num.charAt(i))) sb.deleteCharAt(i);
            else return sb.toString();
        }
        return sb.toString();
    }
}