        for (int i = 0; i < s.length(); i++) {
            char currentRoman = s.charAt(i);
            int currentInteger = roman.get(currentRoman);
        int prevInt = roman.get(s.charAt(0));
        int total = 0;

        roman.put('M',1000);
        roman.put('D',500);
            total +=currentInteger;
            if( i>0 && currentInteger>prevInt) {
                total = total - (prevInt*2);
            }
            prevInt = roman.get(s.charAt(i));
        }
        return total;
    }
}
"
