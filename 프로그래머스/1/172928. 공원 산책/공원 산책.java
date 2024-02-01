class Solution {
    public int[] solution(String[] park, String[] routes) {
        String[][] rail = new String[park.length][park[0].length()];
		for(int i=0;i<rail.length;i++) {
			rail[i]=park[i].split("");
		}
		String[][] site = new String[routes.length][2];
		for(int i=0;i<site.length;i++) {
			site[i]=routes[i].split(" ");
		}
		
		int h=0,w=0;
		for(int i=0;i<rail.length;i++) {
			for(int i1=0;i1<rail[0].length;i1++) {
				if(rail[i][i1].equals("S")) {
					h= i;
					w= i1;
				}
			}
		}
		
		for(int i=0;i<routes.length;i++) {
			int num=Integer.parseInt(site[i][1]);
			boolean ox=true;
			if(site[i][0].equals("N")&&h-num>=0) {
				for(int i1=1;i1<=num;i1++) {
					if(rail[h-i1][w].equals("X"))ox=false;
				}
				if(ox==true) {
					h-=num;
				}
			}else if(site[i][0].equals("S")&&h+num<rail.length) {
				for(int i1=1;i1<=num;i1++) {
					if(rail[h+i1][w].equals("X"))ox=false;
				}
				if(ox==true) {
					h+=num;
				}
			}else if(site[i][0].equals("W")&&w-num>=0) {
				for(int i1=1;i1<=num;i1++) {
					if(rail[h][w-i1].equals("X"))ox=false;
				}
				if(ox==true) {
					w-=num;
				}
			}else if(site[i][0].equals("E")&&w+num<rail[0].length) {
				for(int i1=1;i1<=num;i1++) {
					if(rail[h][w+i1].equals("X"))ox=false;
				}
				if(ox==true) {
					w+=num;
				}
			}
		}
        int[] answer={h,w};
        return answer;
    }
}