class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int start = 0;
        int end = 0;
        int[] map = new int[26];
        int maxFreq = 0; 
        int maxSize = 0;
        while(end < n) {
            
            int size = end - start + 1;
            int idx = s.charAt(end) - 65;
            map[idx]++;
            maxFreq = Math.max(maxFreq,map[idx]);
            if(size - maxFreq > k) {
                map[s.charAt(start) - 65]--;
                start++;
            }
            else {
                maxSize = Math.max(maxSize, size);
                
            }
            end++;
            }

            return maxSize;
            
    }
    
}
