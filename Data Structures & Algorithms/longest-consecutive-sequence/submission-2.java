class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for(int num: nums) {
            seen.add(num);
        }
        int max = 0;
        for(int num:seen) {
            if(!seen.contains(num-1)) {
                int streak = 1;
                int curr = num;
                while(seen.contains(curr+1)) {
                    streak++;
                    curr++;
                }
                max = Math.max(max, streak);
            }
        }

        return max;
    }
}
