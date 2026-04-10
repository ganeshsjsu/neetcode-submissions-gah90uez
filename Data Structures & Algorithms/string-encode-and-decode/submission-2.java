class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str: strs) {
            int len  = str.length();
            sb.append(len).append('#').append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        int sidx = 0;
        int eidx = str.indexOf('#',sidx);
        List<String> res = new ArrayList<>();

        while(eidx != -1) {
            int len = Integer.parseInt(str.substring(sidx,eidx));
            int start = eidx + 1;
            int end = start + len;
            
            res.add(str.substring(start,end));
            sidx = end;
            eidx = str.indexOf('#',sidx);
            //System.out.println(str.substring(sidx,eidx));
        }
        
        return res;


    }
}
