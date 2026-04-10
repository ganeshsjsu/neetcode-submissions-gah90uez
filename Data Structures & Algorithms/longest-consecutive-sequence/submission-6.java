class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length <= 0) return 0;
        Set<Integer> seen = new HashSet<>();
        int max = 1;
        for(int n: nums) {
            seen.add(n);
        }

        for(int n: seen) {
            if(!seen.contains(n-1)) {
                int streak = 1;
                int start = n;
                while(seen.contains(start+1)) {
                    streak++;
                    start++;
                }
                max = Math.max(streak, max);
            }
        }

        return max;
    }
}
