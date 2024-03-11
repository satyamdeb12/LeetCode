                lastWord = s.charAt(i) + lastWord;
            } else {
                if(wordStarted == true) {
                    System.out.println(lastWord);
                    return lastWord.length();
                }
            }
            i--;
                wordStarted = true;
            if(!Character.isWhitespace(s.charAt(i))) {
        String lastWord = "";
        boolean wordStarted = false;
        int i=s.length()-1;
        while (i>=0) {
    public int lengthOfLastWord(String s) {
class Solution {
"
