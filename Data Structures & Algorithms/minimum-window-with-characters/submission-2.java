class Solution {
    public String minWindow(String s, String t) {
        int n = s.length();
    
        Map<Character,Integer> lookup = new HashMap<>();
        for(int i=0; i<t.length(); i++) {
            lookup.put(t.charAt(i), lookup.getOrDefault(t.charAt(i),0)+1);
        }

        int needed = t.length();

        int start = 0;
        int end = 0;
        String result = "";
        int min = s.length();

        while(end < n) {
            if(lookup.containsKey(s.charAt(end))) {
                if (lookup.get(s.charAt(end)) > 0) {
                    needed--;
                }
                lookup.put(s.charAt(end), lookup.get(s.charAt(end)) - 1);
            }
            while(needed == 0) {
                if(lookup.containsKey(s.charAt(start))) {
                    if (lookup.get(s.charAt(start)) == 0) {
                        needed++;
                    }
                    lookup.put(s.charAt(start), lookup.get(s.charAt(start)) + 1);
                }
                if(s.substring(start,end+1).length() <= min) {
                    result = s.substring(start,end+1);
                    min = s.substring(start,end+1).length();
                }
                start++;
            }
            end++;
        }

        return result;

        
    }
}
