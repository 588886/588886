import java.util.ArrayList;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> list = new ArrayList<Integer>();
    	for(int i=0;i<intStrs.length;i++) {
    		String str="";
    		char[] st=intStrs[i].toCharArray();
    		for(int i1=s;i1<(s+l);i1++) {
    			
    			str+=st[i1]+"";
    			
    		}
    		int stI=Integer.parseInt(str);
    		if(stI>k) {
    			list.add(stI);
    		}
    		
    	}
    	
    	int[] answer = new int[list.size()];
    	for(int i=0;i<list.size();i++) {
    		answer[i]=list.get(i);
    	}
        return answer;
    }
}