class Solution {
    public int solution(int[] num_list) {
        String[] str=new String[num_list.length]; 
    	String result1="";
    	String result2="";
    	for(int i=0;i<num_list.length;i++) {
    		str[i]=num_list[i]+"";
    	}
    	for(int i=0;i<num_list.length;i++) {
    		if((num_list[i]%2)==0) {
    			result1+=str[i];
    		}else {
    			result2+=str[i];
    		}
    	}
    	int answer=Integer.parseInt(result1)+Integer.parseInt(result2);
        return answer;
    }
}