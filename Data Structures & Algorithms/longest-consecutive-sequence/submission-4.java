class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Set<Integer> seen = new HashSet<>();
        for(int n : nums) {
            seen.add(n);
        }
        int max = 1;

        for(int a: seen) {
            if(!seen.contains(a-1)) {
                int streak = 1;
                int tmp = a;
                while(seen.contains(tmp+1)) {
                    streak++;
                    tmp++;
                }
                max = Math.max(max , streak);
            }
        }

        return max;
    }
}
