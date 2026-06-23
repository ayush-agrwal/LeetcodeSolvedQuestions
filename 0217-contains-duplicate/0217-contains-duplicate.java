class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        Set<Integer> num = new HashSet<>();
        for(int i:nums){

            if(num.add(i)){
                continue;
            }
            else{
                return true;
            }
        }
        return false;

    }
}