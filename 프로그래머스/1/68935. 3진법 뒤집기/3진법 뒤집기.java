class Solution {
    public int solution(int n) {
        String ternaryString = Integer.toUnsignedString(n,3);
		
		ternaryString=new StringBuilder(ternaryString).reverse().toString();
		
		
		int answer=0;
		for(int i=0;i<ternaryString.length();i++) {
			answer+=(Integer.parseInt(ternaryString.charAt(ternaryString.length()-1-i)+""))*(Math.pow(3, i));
		}
		
        return answer;
    }
}