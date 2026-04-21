class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        

        
        

        int start = 0;
        int end = 0;
        int[] freq = new int[128];
        int max = 0; 

        while(end < n) {
            char right = s.charAt(end);
            freq[right]++;
            while(freq[right] > 1) {
                char left = s.charAt(start);
                freq[left]--;
                start++;
            }
            max = Math.max(max, end - start + 1);
            end++;

        }

        return max;
    }
}
