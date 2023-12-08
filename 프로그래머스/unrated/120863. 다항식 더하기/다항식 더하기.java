class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String pol[]=polynomial.split(" ");
		int countX=0;
		int count=0;
		for(String str:pol) {
			if(str.contains("x")&&!str.equals("+")){
				countX+=str.equals("x") ? 
                    1:Integer.parseInt(str.substring(0, str.length()-1));
			}else if(!str.equals("+")){
				count+=Integer.parseInt(str);
			}
		};
        if(countX!=0&&countX!=1)answer+=countX+"x";
        else if(countX!=0&&countX==1)answer+="x";
        if(count!=0&&!answer.equals(""))answer+=" + "+count;
        else if(count!=0&&answer.equals(""))answer+=count+"";
        return answer;
    }
}