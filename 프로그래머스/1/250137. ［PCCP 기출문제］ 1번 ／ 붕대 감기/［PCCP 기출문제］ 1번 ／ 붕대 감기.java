class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int time=attacks[attacks.length-1][0];
		int count=0;
		int hp=health;
		int ap=0;
		for(int i=0;i<=time;i++) {
			if(i==attacks[ap][0]) {
				hp-=attacks[ap][1];
				ap++;
                count=0;
			}else if(hp<health) {
				hp+=bandage[1];
				count++;
				if(count==bandage[0]) {
					hp+=bandage[2];
					count=0;
				}
				if(hp>health) {
					hp=health;
				}
			}else {
				count++;
			}
			if(hp<=0) {
				break;
			}
		}
        return hp>0 ? hp:-1;
    }
}