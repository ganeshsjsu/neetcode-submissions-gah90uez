class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character,Integer> freq = new HashMap<>();

        int start =0;
        int end = 0;
        int maxlen = 0;
        int currmaxfreq = 0;
        while(end < s.length()) {
            freq.put(s.charAt(end), freq.getOrDefault(s.charAt(end),0)+1);
            if(currmaxfreq < freq.get(s.charAt(end))) {
                currmaxfreq = freq.get(s.charAt(end));
            }

            int winsize = end - start + 1;
            int left = winsize - currmaxfreq;
            

            if(left > k) {
                  winsize = end - start + 1;
                left = winsize - currmaxfreq;
                freq.put(s.charAt(start), freq.getOrDefault(s.charAt(start),0)-1);
                start++;
            }
            maxlen = Math.max(end- start + 1, maxlen);
            end++;
        }

        return maxlen;
    }
}
