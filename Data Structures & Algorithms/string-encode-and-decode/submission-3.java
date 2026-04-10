class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str: strs) {
            int len = str.length();
            sb.append(len).append('#').append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int start = 0;
        int end = str.indexOf('#',start);

        while(end != -1) {
            int len = Integer.parseInt(str.substring(start,end));
            int sidx = end + 1;
            int eidx = sidx + len; 
            result.add(str.substring(sidx,eidx));
            start = eidx;
            end = str.indexOf('#',start);
        }

        return result;

    }
}
