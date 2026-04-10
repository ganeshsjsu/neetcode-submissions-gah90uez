class Solution {
    public boolean isAnagram(String s, String t) {
        char[] freq1 = new char[26];
        char[] freq2 = new char[26];
        for(char m: s.toCharArray()) {
            freq1[m - 'a']++; 
        }
        
        for(char n: t.toCharArray()) {
            freq2[n - 'a']++; 
        }

        if(Arrays.equals(freq1,freq2)) return true;
        return false;
    }
}
