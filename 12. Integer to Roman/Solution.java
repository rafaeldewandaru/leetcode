class Solution {
    public String intToRoman(int num) {
        String ans = "";

        String[] thousands = {"", "M", "MM", "MMM"};
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] ones = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        
        ans += thousands[(int) Math.floor(num/1000)];
        num %= 1000;

        ans += hundreds[(int) Math.floor(num/100)];
        num %= 100;

        ans += tens[(int) Math.floor(num/10)];
        num %= 10;

        ans += ones[num];

        return ans;
        
    }
}