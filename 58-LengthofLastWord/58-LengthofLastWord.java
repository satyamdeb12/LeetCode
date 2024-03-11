class Solution {
    public int lengthOfLastWord(String s) {
        String lastWord = "";
        s = s.strip();
        int i=s.length()-1;
        while(i>=0) {
            if(Character.isWhitespace(s.charAt(i))){
                return s.substring(i+1).length();
            }
            i--;
        }
    }

        return lastWord.length();
}
"
