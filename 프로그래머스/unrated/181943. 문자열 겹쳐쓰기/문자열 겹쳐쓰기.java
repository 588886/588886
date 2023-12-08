class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        char ch[]=my_string.toCharArray();
        String answer = "";
        for(int a = 0;a<s;a++ ) {
    		answer+=ch[a];
    	}
        if(my_string.length()>(s+overwrite_string.length())){
            answer+=overwrite_string;
            for(int a = (s+overwrite_string.length());a<my_string.length();a++ ) {
    		answer+=ch[a];
    	    }
        }else{
        answer+=overwrite_string;
        }
        return answer;
    }
}