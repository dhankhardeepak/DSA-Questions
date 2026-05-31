class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
                List<List<String>> ans = new ArrayList<>();
                        if(strs.length == 1){
                                    List<String> ls = new ArrayList<>();
                                                ls.add(strs[0]);
                                                            ans.add(ls);
                                                                        return ans;
                                                                                }

                                                                                        for(int i = 0; i < strs.length; i++){
                                                                                                    if(strs[i] == "d") continue;
                                                                                                                List<String> ls = new ArrayList<>();
                                                                                                                            ls.add(strs[i]);
                                                                                                                                        for(int j = i+1; j < strs.length; j++){
                                                                                                                                                        if(strs[i].length() == strs[j].length() && isAnagram(strs[i], strs[j])){
                                                                                                                                                                            ls.add(strs[j]);
                                                                                                                                                                                                strs[j] = "d";
                                                                                                                                                                                                                }
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                        ans.add(ls);
                                                                                                                                                                                                                                                }

                                                                                                                                                                                                                                                        return ans;
                                                                                                                                                                                                                                                            }

                                                                                                                                                                                                                                                                public boolean isAnagram(String s, String t){
                                                                                                                                                                                                                                                                        if(s.length() != t.length()) return false;

                                                                                                                                                                                                                                                                                int[] freq = new int[26];
                                                                                                                                                                                                                                                                                        for(int i = 0; i < s.length(); i++){
                                                                                                                                                                                                                                                                                                    freq[s.charAt(i) - 'a']++;
                                                                                                                                                                                                                                                                                                                freq[t.charAt(i) - 'a']--;
                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                for(int count : freq){
                                                                                                                                                                                                                                                                                                                                            if(count != 0) return false;
                                                                                                                                                                                                                                                                                                                                                    }

                                                                                                                                                                                                                                                                                                                                                            return true;
                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                }
}