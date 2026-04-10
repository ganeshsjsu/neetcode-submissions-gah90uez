class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] chars = new int[26];
        for(int i=0; i<s.length(); i++) {
            int c = s.charAt(i) - 'a';
            chars[c]++;
            int k = t.charAt(i) - 'a';
            chars[k]--;
        }

        for(int i=0; i<26; i++) {
            if(chars[i] != 0) {
                return false;
            }
        }

        return true;

    }
}
