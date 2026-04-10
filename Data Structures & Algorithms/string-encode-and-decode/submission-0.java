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
        int start = 0;
        int end = str.indexOf('#');
        List<String> res = new ArrayList<>();
        
        while(end != -1) {
            
            int len = Integer.parseInt(str.substring(start, end));
            res.add(str.substring(end+1,end+len+1));
            start = end+len+1;
            end = str.indexOf('#',start);


        }
        
        return res;
    }   
}
