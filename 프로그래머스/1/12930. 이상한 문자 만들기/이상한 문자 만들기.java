class Solution {
    public String solution(String s) {
        String[] strList=s.split(" ",-1);
		
		
		String answer="";
		
		for(int i=0;i<strList.length;i++) {
			for(int j=0;j<strList[i].length();j++) {
				if(strList[i].length()!=0) {
					if((j+1)%2==1) {
						answer+= Character.toUpperCase(strList[i].charAt(j))+"";
					}else {
						answer+=Character.toLowerCase(strList[i].charAt(j))+"";
					}
				}else {
					answer+=" ";
				}
			}
			if(i!=strList.length-1)answer+=" ";
		}
        return answer;
    }
}