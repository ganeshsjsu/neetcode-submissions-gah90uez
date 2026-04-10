class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int m: nums) {
            map.put(m, map.getOrDefault(m,0)+1);
        }

        List<Integer>[] arr = new ArrayList[n+1];
        for(int t: map.keySet()) {
            int idx = map.get(t);
            if(arr[idx] == null) arr[idx] = new ArrayList<>();
            arr[idx].add(t);
        }

       
        int start = 0;
        for(int i=n; i>=0; i--) {
            if(arr[i] != null) {
                for(int o: arr[i]) {
                    res[start] = o;
                    k--;
                    start++;
                    if(k == 0) return res;
                }
            }
            
        }

        return res;
    }
}
