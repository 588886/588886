class Solution {
    public int solution(int n, int m, int[] section) {
        if(section.length == 1) 
            return 1;
        else {
            int count=0;
            int referencePoint=section[0];
            int i=0;
            while (referencePoint<=n&&referencePoint<=section[section.length-1]) {
                if(section[i]==referencePoint) {
                    count++;
                    referencePoint+=m;
                    i++;
                }else if(section[i]<referencePoint) {
                    i++;
                }else if(section[i]>referencePoint){
                    referencePoint=section[i]+m;
                    count++;
                    i++;
                }

            }
            return count;
        }
    }
}