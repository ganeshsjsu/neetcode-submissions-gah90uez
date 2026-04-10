class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> map= new HashMap<>();
        for(String str: strs) {
            int[] freq = new int[26];
            for(char c: str.toCharArray()) {
                int idx = c - 'a';
                freq[idx]++;
            }
            String sig = Arrays.toString(freq);
            map.computeIfAbsent(sig, k -> new ArrayList<String>()).add(str);
        }
        return new ArrayList(map.values());

       
    }
}
