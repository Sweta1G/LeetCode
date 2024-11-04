class Solution {
    public String compressedString(String word) {
        StringBuilder sb= new StringBuilder();
        int cnt= 1;
        for(int i=0; i<word.length()-1; i++){
            if(word.charAt(i)==word.charAt(i+1)) {
                cnt++;
                if(cnt>9){ sb.append("9" + word.charAt(i)); cnt= 1;}
            }
            else{
                String c= String.valueOf(cnt);
                sb.append(c);
                sb.append(word.charAt(i));
                cnt =1;
            }
        }
        String c= String.valueOf(cnt);
        sb.append(c);
        sb.append(word.charAt(word.length()-1));
        return sb.toString();
    }
}