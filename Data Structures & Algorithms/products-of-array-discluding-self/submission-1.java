class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];
        res[0] = 1;

        for(int i=1; i<len; i++) {
            res[i] = nums[i-1] * res[i-1];
        }

        int tmp = nums[len-1];

        for(int i=len-2; i>=0; i--) {
            res[i] = tmp * res[i];
            tmp *= nums[i];
        }

        return res;
    }
}  
