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
        List<String> res = new ArrayList<>();
        int start = 0;
        int end = str.indexOf('#',start);
        

        while(start < end) {
            int len = Integer.parseInt(str.substring(start,end));
            int begin = end+1;
            res.add(str.substring(begin, begin+len));
            start = begin+len;
            end = str.indexOf('#',start);
        }
        return res;
    }
}
