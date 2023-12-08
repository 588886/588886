class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        char[] codeCh= code.toCharArray();
    	String[] codeSt =new String[codeCh.length];
    	for(int i=0;i<codeCh.length;i++) {
    		codeSt[i]=codeCh[i]+"";
    	}
    	for(int i=0;i<codeCh.length;i++) {
    		if(mode==0) {
    			if(codeSt[i].equals("1")) {
    				mode=1;
    			}else if(!(codeSt[i].equals("1"))) {
    				if(i%2==0) {
    					answer+=codeCh[i];
    				}
    			}
    			
    		}else if(mode==1) {
    			if(codeSt[i].equals("1")) {
    				mode=0;
    			}else if(!(codeSt[i].equals("1"))) {
    				if(i%2==1) {
    					answer+=codeCh[i];
    				}
    			}
    			
    		}
    		
    	}
        if(answer.equals("")) {
    		answer="EMPTY";
    	}
        return answer;
    }
}