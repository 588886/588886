
import java.util.ArrayList;
class Solution {
    public ArrayList<Integer> solution(int n) {
        ArrayList<Integer> answer=new ArrayList<Integer>();
		
		for(int i=2;i<=n;i++) {
			if(n%i==0) {
				if(answer.size()==0)answer.add(i);
				if(answer.size()!=0&&answer.get(answer.size()-1)!=i)answer.add(i);
				n/=i;
				i=1;
			}
		}
        return answer;
    }
}