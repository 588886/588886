class Solution {
    public String solution(int[] food) {
        String answer="";
		for(int i=1;i<food.length;i++) {
			if(food[i]>1) {
				for(int j=0;j<food[i]/2;j++) {
					answer+=i;
				}
			}
		}
		char[] foodReverce=answer.toCharArray();
		answer+="0";
		for(int i=foodReverce.length-1;i>=0;i--) {
			answer+=foodReverce[i];
		}
        return answer;
    }
}