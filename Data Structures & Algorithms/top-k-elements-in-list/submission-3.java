class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[k];

        for(int p: nums) {
            map.put(p, map.getOrDefault(p,0)+1);
        }
        
        List<Integer>[] order = new List[n+1];
        int resIdx  = 0;
        
       
        map.forEach((key, value) ->{
                if(order[value] == null) order[value] = new ArrayList<>();
                order[value].add(key);
    });
        
        for(int i=n; i>=0; i--) {
            if(order[i] != null) {
                for(int j: order[i]) {
                    res[resIdx++] = j;
                    if(k == resIdx) return res;
                }
            }
        }

        return res;


    }
}
