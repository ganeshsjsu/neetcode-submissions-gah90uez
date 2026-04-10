class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2; i++) {
            if(i > 0 && nums[i] == nums[i-1]) continue;
                int left = i+1;
                int right = nums.length-1;
                
                while(left < right) {
                    int target = nums[i] + nums[left] + nums[right];
                    if(target == 0) {
                    List<Integer> tmp = new ArrayList<>(Arrays.asList(nums[i], nums[left], nums[right]));
                    res.add(tmp);
                    left++;
                    right--;
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                    // FIXED: Skip duplicates for 'right' to avoid identical triplets
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                }
                else if(target > 0) {
                    right--;
                }
                else {
                    left++;
                }
               
         }
                
            

        }

        return res;
    }
}
