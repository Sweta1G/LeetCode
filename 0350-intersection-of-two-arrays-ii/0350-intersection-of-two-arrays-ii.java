class Solution {
    private static int[] convertToIntArray(ArrayList<Integer> list)  { 
        int[] intArray = new int[list.size()];  
        for (int i = 0; i < list.size(); i++) 
            intArray[i] = list.get(i); 
        return intArray; 
    } 
    public int[] intersect(int[] nums1, int[] nums2) {
        int i=0, j=0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        ArrayList<Integer> list= new ArrayList<>();
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                list.add(nums1[i]);
                i++;j++;
            }
            else if(nums1[i]<nums2[j]) i++;
            else j++;
        }
        return convertToIntArray(list);
    }
}