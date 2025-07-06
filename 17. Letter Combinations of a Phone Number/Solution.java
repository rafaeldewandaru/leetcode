import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = Arrays.asList("");
        List<String> l0 = Arrays.asList(" ");
        List<String> l1 = Arrays.asList("");
        List<String> l2 = Arrays.asList("a","b","c");
        List<String> l3 = Arrays.asList("d","e","f");
        List<String> l4 = Arrays.asList("g","h","i");
        List<String> l5 = Arrays.asList("j","k","l");
        List<String> l6 = Arrays.asList("m","n","o");
        List<String> l7 = Arrays.asList("p","q","r","s");
        List<String> l8 = Arrays.asList("t","u","v");
        List<String> l9 = Arrays.asList("w","x","y","z");
        
        List<List<String>> map = Arrays.asList(l0,l1,l2,l3,l4,l5,l6,l7,l8,l9);

        if (digits.equals("")) {
            return new ArrayList<>();
        }

        for (int i = 0; i < digits.length(); i++) {
            res = crossProduct(res, map.get(digits.charAt((i))-'0'));
        }

        return res;
    }

    public List<String> crossProduct(List<String> arr1, List<String> arr2) {
        List<String> crossProduct = new ArrayList<>();

        for (String s1 : arr1) {
            for (String s2 : arr2) {
                crossProduct.add(s1 + s2);
            }
        }

        return crossProduct;
    }


}