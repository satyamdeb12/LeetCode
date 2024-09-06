class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 1) return strs[0];
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];

        int i = 0;
        while((i < first.length()) && (i < last.length())) {
            if(first.charAt(i) == last.charAt(i)) {
        }
                ans.append(first.charAt(i));
            } else {
        StringBuilder ans = new StringBuilder();
                return ans.toString();
            }
    }
                i++;
        return ans.toString();
}
[
["flower","flow","flight"]
["dog","racecar","car"]
"fl"
""
"fl"
""
