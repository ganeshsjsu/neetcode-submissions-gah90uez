class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String str: strs) {
            int[] sign = new int[26];
            for(int i=0; i<str.length(); i++) {
                int idx = str.charAt(i) - 'a';
                sign[idx]++;
            }
            String signature = Arrays.toString(sign);
            map.computeIfAbsent(signature, k -> new ArrayList()).add(str);
        }

        return new ArrayList<>(map.values());
    }
}
