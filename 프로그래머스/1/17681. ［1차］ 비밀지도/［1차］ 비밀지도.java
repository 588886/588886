class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer=new String[n];
		for(int i=0;i<n;i++) {
			answer[i]="";
			String str=Integer.toBinaryString(arr1[i]);
			String str2=Integer.toBinaryString(arr2[i]);
			if(str.length()<n) {
				for(int k=0;k<n;k++) {
					str="0"+str;
					if(str.length()==n)break;
				}
			}
			if(str2.length()<n) {
				for(int k=0;k<n;k++) {
					str2="0"+str2;
					if(str2.length()==n)break;
				}
			}
			for(int j=0;j<n;j++) {
				if(str.charAt(j)==49||str2.charAt(j)==49) {
					answer[i]+="#";
				}else if(str.charAt(j)==48||str2.charAt(j)==48) {
					answer[i]+=" ";
				}
			}
		}
        return answer;
    }
}