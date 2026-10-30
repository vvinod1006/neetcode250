class Solution {
    public String longestCommonPrefix(String[] strs) {
       if(strs == null || strs.length == 0){
        return "";
       }
        Arrays.sort(strs);
       StringBuilder ans = new StringBuilder();
       String first = strs[0];
       String last = strs[strs.length-1];

       for(int i = 0;i<=first.length()-1 && i<=last.length()-1;i++){
            if(first.charAt(i) != last.charAt(i)){
                break;
            }
            ans.append(first.charAt(i));
       }
       return ans.toString();
        
    }
}