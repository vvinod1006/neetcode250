class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int x: nums){
            hs.add(x);
        }
        if( hs.size() == nums.length){
            return false;
        }

        return true;
        
    }
}