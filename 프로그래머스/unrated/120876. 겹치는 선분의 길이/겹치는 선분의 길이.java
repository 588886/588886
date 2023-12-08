class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
		int s=lines[0][0]>lines[1][0] ? lines[1][0] : lines[0][0];
		s=s>lines[2][0] ? lines[2][0] : s;
		int b=lines[0][1]<lines[1][1] ? lines[1][1] : lines[0][1];
		b=b<lines[2][1] ? lines[2][1] : b;
		int []line=new int[b-s];
		for(int i=0;i<line.length;i++) {
			line[i]=s+i;
		}
		for(int i: line) {
			int cnt=0;
			if(lines[0][0]<=i && i<lines[0][1]) cnt++;
			if(lines[1][0]<=i && i<lines[1][1]) cnt++;
			if(lines[2][0]<=i && i<lines[2][1]) cnt++;
			if(cnt>=2)answer++;
		}
        return answer;
    }
}