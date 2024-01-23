
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
class Solution {
    public List<String> solution(String[] players, String[] callings) {
        List<String> lank=Arrays.asList(players);
		 Map<String, Integer> playerIndices = new HashMap<>();
        for (int i = 0; i < lank.size(); i++) {
            playerIndices.put(lank.get(i), i);
        }

        for (String calling : callings) {
            int currentIndex = playerIndices.get(calling);

            if (currentIndex > 0) {
                // 현재 선수와 바로 앞의 선수를 교환
                String temp = lank.get(currentIndex);
                lank.set(currentIndex, lank.get(currentIndex - 1));
                lank.set(currentIndex - 1, temp);

                // 맵을 업데이트
                playerIndices.put(lank.get(currentIndex), currentIndex);
                playerIndices.put(lank.get(currentIndex - 1), currentIndex - 1);
            }
        }
        return lank;
    }
};