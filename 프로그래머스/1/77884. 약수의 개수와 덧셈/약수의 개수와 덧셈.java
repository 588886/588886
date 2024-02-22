class Solution {
    public int solution(int left, int right) {
        int result=0;
		for(int j=left;j<=right;j++) {
            int answer=0;
            if(j%2==0) {
			    for(int i=1;i<=(j/2)-1;i++) {if(j%i==0)answer++;}
			    answer+=2;
		    }else {
                for(int i=1;i<=j/2;i++) {
                    if(j%i==0)answer++;}
            answer++;}
			result+=answer%2==0 ? j:(j*-1);
		}
        return result;
    }
}