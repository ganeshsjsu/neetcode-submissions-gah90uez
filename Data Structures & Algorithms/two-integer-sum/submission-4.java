class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Map<Integer, Integer> seenPair = new HashMap<>();

        for(int i=0; i<n; i++) {
            int complement = target - nums[i];
            if(seenPair.containsKey(complement)) {
                return new int[]{seenPair.get(complement),i};
            }
            seenPair.put(nums[i], i);
        }

        return new int[]{-1, -1};
    }
}
