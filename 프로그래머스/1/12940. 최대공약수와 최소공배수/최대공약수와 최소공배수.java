class Solution {
    public int[] solution(int n, int m) {
        int[] result= {0,0};
		for(int j=1;j<=1000000;j++) {
			if(n%j==0&&m%j==0) {
				result[0]=j;
			}else if(j%n==0&&j%m==0){
				result[1]=j;
				break;
			}
		}
        return result;
    }
}