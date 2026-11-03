class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer> [] bucket = new List [nums.length+1];
        Map<Integer,Integer> map = new HashMap<>();

        for(int x: nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for(int key : map.keySet()){
            int frequency = map.get(key);
            if(bucket[frequency]==null){
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(key);

        }
        int [] res = new int[k];
        int count = 0;
        for(int j=bucket.length-1;j>=0 && count < k ; j--){
            if(bucket[j] != null){
                for(Integer x :bucket[j]){
                    res[count++] = x;
                }
            }
        }
        return res;
    }
}
