class Solution {
    public int solution(int startNum, int endNum, int selectNum) {
        int count = 0;
        for (int i = startNum; i <= endNum; i++) {
            count += Integer.toString(i).split(Integer.toString(selectNum), -1).length - 1;
        }
        return count;
    }
}