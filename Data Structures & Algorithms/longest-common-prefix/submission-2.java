class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
       String ans = "";
        Arrays.sort(strs);

        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length-1].toCharArray();

        for(int i=0;i<=first.length-1 && i<=last.length-1;i++){
            if(first[i] != last[i]){
                break;
            }
            ans = ans + first[i];

        } 
        return ans;
        
    }
}