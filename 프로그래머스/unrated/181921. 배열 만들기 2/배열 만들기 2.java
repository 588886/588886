class Solution {
    public int[] solution(int l, int r) {
        String StringRe="";
		int s = 1000000;
		int[] answer = null;
		for(int is=l;is<=r;is++) {
			boolean a = true;
			for(int i=1000000;i>=10;i/=10) {
				
				if(!(((is/i)%5)==0)) {
					a=false;
				}
				
			}
			if((a==true)&&(is%5==0)) {
				StringRe+=is+".";
			}
			
		}
		
		String[] strRe=StringRe.split("\\.");
		if(StringRe.equals("")) {
			answer = new int[1];
			answer[0]=-1;
		}else {
			answer = new int[strRe.length] ;
			
			for(int i = 0;i<answer.length;i++) {
				answer[i]=Integer.parseInt(strRe[i]);
			}
		}
        return answer;
    }
}