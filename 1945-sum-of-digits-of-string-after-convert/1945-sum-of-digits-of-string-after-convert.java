class Solution {
    public int getLucky(String s, int k) {
        int res =0;
        
        while(k-->0){
            StringBuilder sb= new StringBuilder();
            for(int i=0; i<s.length(); i++){
                int x;
                if( (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'))
                    x= (int) (s.charAt(i)-'a'+1);
                else
                    x= Integer.parseInt(s.substring(i, i+1));
                // System.out.print("X: "+x+"   ");
                String c= String.valueOf(x);
                // System.out.println("C: "+c+"   ");
                sb.append(c);
            }
            // System.out.println("Final SB: "+sb);
            int sum= 0;
            for(int i=0; i<sb.length(); i++){
                // System.out.print("Int val: "+ (int)(sb.charAt(i)-'0')+"    ");
                int x= (int)(sb.charAt(i)-'0');
                sum+= x;
            }
            s= String.valueOf(sum);
            // System.out.println("Sum Value: "+sum);
            // System.out.println("Reformed String: "+s);
            res= sum;
        }
        return res;
    }
    
    // c-'a'+1
}