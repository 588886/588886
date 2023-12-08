
import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr) {
        int a=-1;
		int b=-1;
		for(int i = 0; i< arr.length;i++) {
			
			if(arr[i]==2) {
				
				a=i;
				break;
				
			}
			
		}
		
		for(int i = arr.length-1; i>= 0;i--) {
			
			if(arr[i]==2) {
				
				b=i;
				break;
				
			}
			
		}
		
		int[] answer= new int[b-a+1];
		
		if(a!=-1) {
			
			for(int i = a;i<=b;i++) {
				
				answer[i-a]=arr[i];
				
			}
			
		}else {
			
			answer[0]=-1;
			
		}
        return answer;
    }
}