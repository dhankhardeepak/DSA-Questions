class Solution {
    public int romanToInt(String s) {
        int i = s.length() - 1;
        HashMap<Character, Integer> hm = new HashMap<>();
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);
        
        int ans = 0;
        while(i >= 0){
            char c = s.charAt(i);
            if(c == 'V' || c == 'X'){
                if(i-1 >= 0 && s.charAt(i - 1) == 'I'){
                    ans += hm.get(s.charAt(i)) - hm.get(s.charAt(i-1));
                    i -= 2; 
                    continue;
                }
            }
            else if(c == 'L' || c == 'C'){
                if(i-1 >= 0 && s.charAt(i-1) == 'X'){
                    ans += hm.get(s.charAt(i)) - hm.get(s.charAt(i-1));
                    i -= 2;
                    continue;
                }
            }
            else if(c == 'D' || c == 'M'){
                if(i-1 >= 0 && s.charAt(i-1) == 'C'){
                    ans += hm.get(s.charAt(i)) - hm.get(s.charAt(i-1));
                    i -= 2;
                    continue;
                }
            }
            ans += hm.get(s.charAt(i));
            i--;
        }

        return ans;
    }
}