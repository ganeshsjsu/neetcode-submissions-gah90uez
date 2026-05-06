class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] freq = new char[128];
        int start = 0;
        int end = 0;
        int maxlen = 0;

        while(end < s.length()) {
            int c = s.charAt(end);
            freq[c]++;
           
            while(freq[c] > 1) {
                System.out.println(c);
                int t = s.charAt(start);
                freq[t]--;
                start++;
            }

            int currlen = end - start + 1;
            maxlen = Math.max(maxlen, currlen);
            end++;
            
        }

        return maxlen;
    }
}
