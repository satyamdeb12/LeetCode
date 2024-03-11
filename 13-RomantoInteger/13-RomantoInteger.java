class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> roman = new HashMap<>();
        roman.put('I',1);
        roman.put('V',5);
        roman.put('X',10);
        roman.put('L',50);
        roman.put('C',100);
        roman.put('D',500);
        roman.put('M',1000);

        int total = 0;
        int prevInt = roman.get(s.charAt(0));
        for (int i = 0; i < s.length(); i++) {
            char currentRoman = s.charAt(i);
            int currentInteger = roman.get(currentRoman);
            total +=currentInteger;
            if( i>0 && currentInteger>prevInt) {
                total = total - (prevInt*2);
            }
            prevInt = roman.get(s.charAt(i));
        }
        return total;
    }
}
