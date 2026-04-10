class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String s: strs) {
            int len = s.length();
            sb.append(len).append('#').append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int start = 0;
        int end = str.indexOf('#',start);
        while(start < end) {
            
            int len = Integer.parseInt(str.substring(start,end));
            res.add(str.substring(end+1, end+1+len));
            start = end+1+len;
            end = str.indexOf('#',start);
        }
        return res;

    }
}
