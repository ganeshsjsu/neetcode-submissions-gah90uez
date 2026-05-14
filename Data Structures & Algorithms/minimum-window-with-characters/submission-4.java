class Solution {
    public String minWindow(String s, String t) {
        Map<Character, Integer> freq = new HashMap<>();

        for(int i=0; i<t.length(); i++) {
            char c = t.charAt(i);
            freq.put(c,freq.getOrDefault(c,0)+1);
        }

        int start = 0;
        int end = 0;
        int needed = t.length();
        int minLen = Integer.MAX_VALUE;
        int minstart = 0;

        while(end < s.length()) {
            char currend = s.charAt(end);
            if(freq.containsKey(currend) )  {
                if(freq.get(currend) > 0) {
                    needed--;
                }
                freq.put(currend, freq.get(currend)-1);
                
            }
        

            while(needed == 0) {
                if(end - start + 1 < minLen) {
                minstart = start;
                minLen = end - start + 1;
            }
                char currstart = s.charAt(start);
                if(freq.containsKey(currstart))  {
                    freq.put(currstart, freq.get(currstart)+1);
                    if(freq.get(currstart) > 0) {
                        needed++;
                    }
                    
                    
                }
                
                start++;
            }

            end++;
            
        }

    return minLen==Integer.MAX_VALUE?"":s.substring(minstart, minstart+minLen);

    }

    


    
}
