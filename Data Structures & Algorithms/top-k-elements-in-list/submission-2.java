class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[k];
        Map<Integer, Integer> map = new HashMap<>();
        for(int m : nums) {
            map.put(m,map.getOrDefault(m,0)+1);
        }

        List<Integer>[] bucket = new List[n+1];

        for(int key: map.keySet()) {
            int val = map.get(key);
            if(bucket[val] == null) {
                bucket[val] = new ArrayList<>();
            }
            bucket[val].add(key);
        }

        int idx = 0;
        for(int i = n; i>=0; i--) {
            if(bucket[i] == null) continue;
            for(int v: bucket[i]) {
                if(k == 0) return result;
                result[idx] = v;
                idx++;
                k--;
            }
        }

        return result;
    }
}
