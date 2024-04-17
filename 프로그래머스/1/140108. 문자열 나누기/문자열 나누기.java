class Solution {
    public int solution(String s) {
        int index=0;
		int result=0;
		while(index+1<s.length()) {
			char a=s.charAt(index);
			int stringA=1;
			int stringB=0;
			while(stringA!=stringB) {
				index++;
				if(s.charAt(index)==a) {
					stringA++;
				}else {
					stringB++;
				}
				if(index+1==s.length())break;
			}
			result++;
			index++;
		}
		if(index+1==s.length())result++;
        return result;
    }
}