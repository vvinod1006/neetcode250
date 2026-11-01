class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       Map<String,List<String>> map = new HashMap<>();

       for(String str : strs){
        char [] arr = str.toCharArray();
        Arrays.sort(arr);
        String ans = new String(arr);
        map.putIfAbsent(ans,new ArrayList<>());
        map.get(ans).add(str);
       }
       return new ArrayList<>(map.values());
        
    }
}
