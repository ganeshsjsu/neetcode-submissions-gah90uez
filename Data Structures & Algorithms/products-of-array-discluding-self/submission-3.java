class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        res[0] = 1;

        for(int i=1;i<n;i++) {
            res[i] = res[i - 1] * nums[i - 1];    
        }

        //System.out.println(Arrays.toString(res));

        int tmp = nums[n-1];
        for(int i=n - 2; i>=0; i--) {
            res[i] = tmp * res[i];
            tmp *= nums[i];
        }

        return res;
    }
}  
