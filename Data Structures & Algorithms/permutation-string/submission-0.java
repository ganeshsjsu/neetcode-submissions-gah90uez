class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character, Integer> freq = new HashMap<>();
        for(int i=0; i<s1.length(); i++) {
            freq.put(s1.charAt(i), freq.getOrDefault(s1.charAt(i),0)+1);
        }

        int n = s1.length();
        int start = 0;
        int end = 0;
        int needed = n;

        while(end < s2.length()) {
            if(freq.containsKey(s2.charAt(end))) {
                freq.put(s2.charAt(end), freq.getOrDefault(s2.charAt(end),0)-1);
                if(freq.get(s2.charAt(end)) >= 0) {
                    needed--;
                }
                
            }
            
            if(end >= n) {
                if(freq.containsKey(s2.charAt(start))) {
                    freq.put(s2.charAt(start), freq.getOrDefault(s2.charAt(start),0)+1);
                    if(freq.get(s2.charAt(start)) > 0) {
                    needed++;
                }
                    
                }
                start++;  
            }

            if(needed == 0) {
                return true;
            }
            end++;
            
        }

        return false;
    }
}
