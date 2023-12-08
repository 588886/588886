
import java.util.Arrays;
class Solution {
    public int solution(int[] num_list) {
        int[] num_lista=new int[num_list.length];
    	for(int bb=0;bb<num_list.length;bb++) {
    		num_lista[bb]=num_list[bb];
    	}
        Arrays.sort(num_lista);
        int answer = 0;
        if(num_lista[0]<0){
            for(int as=0;as<num_list.length;as++){
                if(num_list[as]<0){
                	answer=as;
                	break;
                }
            }
        }else{
            answer=-1;
        }
        return answer;
    }
}