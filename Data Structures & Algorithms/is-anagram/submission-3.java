class Solution {
    public boolean isAnagram(String s, String t) {
        int[] sArr = new int[26];
        int[] tArr = new int[26];

        for(char c: s.toCharArray()) {
            int idx = c - 'a';
            sArr[idx]++;
        }

        for(char n: t.toCharArray()) {
            int idx = n - 'a';
            tArr[idx]++;
        }

        return Arrays.equals(sArr, tArr);


    }
}
