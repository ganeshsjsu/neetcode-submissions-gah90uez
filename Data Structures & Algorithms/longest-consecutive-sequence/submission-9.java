class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length <= 0) return 0;
        Set<Integer> seen = new HashSet<>();

        for(int num: nums) {
            seen.add(num);
        }
        int max = 1;
        for(int s : seen) {
            if(!seen.contains(s - 1)) 
            {
                int streak = 1;
                int tmp = s+1;
                while(seen.contains(tmp)) {
                    streak++;
                    tmp++;
                }
                max = Math.max(max, streak);
            }
        }

        return max;
    }
}
