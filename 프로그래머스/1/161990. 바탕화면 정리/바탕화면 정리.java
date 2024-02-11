class Solution {
    public int[] solution(String[] wallpaper) {
        String[][] wallpaperRail=new String[wallpaper.length][wallpaper[0].length()];
		for(int i=0;i<wallpaper.length;i++) {
			wallpaperRail[i]=wallpaper[i].split("");
		}

		int minX=wallpaper[0].length(),minY=wallpaper.length,maxX=0,maxY=0;
		
		for(int i=0;i<wallpaper.length;i++) {
			for(int j=0;j<wallpaper[0].length();j++) {
				
				if(wallpaperRail[i][j].equals("#")&&j<minX)minX=j;
				if(wallpaperRail[i][j].equals("#")&&i<minY)minY=i;
				if(wallpaperRail[i][j].equals("#")&&j+1>maxX)maxX=j+1;
				if(wallpaperRail[i][j].equals("#")&&i+1>maxY)maxY=i+1;
				
			}
		}
        
        int[] answer = {minY,minX,maxY,maxX};
        return answer;
    }
}