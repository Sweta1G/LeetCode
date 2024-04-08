class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int circle=0, square=0;
        for(int i:students){
            if(i==0) circle++;
            else square++;
        }
        
        for(int i:sandwiches){
            if(i==1){
                if(square>0) square--;
                else break;
            }
            if(i==0) {
                if(circle>0) circle--;
                else break;
            }
        }
        return square+circle;
    }
}