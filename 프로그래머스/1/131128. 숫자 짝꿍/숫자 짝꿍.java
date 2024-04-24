import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public String solution(String X, String Y) {
        HashMap<Integer, Integer> numMap=new HashMap<>();
		char[] yList=Y.toCharArray();
		Arrays.sort(yList);
		StringBuilder answer=new StringBuilder();
		for(int i=0;i<10;i++) {
			numMap.put(i, 0);
		}
		
		
		
		for(String str:X.split("")) {
			numMap.put(Integer.parseInt(str), numMap.get(Integer.parseInt(str))+1) ;
		}
		
		for(int i=yList.length-1;i>=0;i--) {
			if(numMap.get(Integer.parseInt(yList[i]+""))>0) {
				numMap.put(Integer.parseInt(yList[i]+""), numMap.get(Integer.parseInt(yList[i]+""))-1) ;
				answer.append(yList[i]+"");
			}
		}
		
        if(answer.toString().equals("")){
            return "-1";
        }else if((answer.toString().charAt(0)+"").equals("0")){
            return "0";
        }else{
            return answer.toString();
        }
    }
}