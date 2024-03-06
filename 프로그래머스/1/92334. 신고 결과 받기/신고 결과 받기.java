import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        Set<String> reportSet = new HashSet<>(Arrays.asList(report));
		List<String> result = new ArrayList<>(reportSet);
		Map<String, Integer> idMap = new HashMap<>();
		Arrays.stream(id_list).forEach(id -> idMap.put(id, 0));
		int[] yellocard = new int[id_list.length];
		int[] answer = new int[id_list.length];
		result.forEach(reportItem -> {
		    String[] parts = reportItem.split(" ");
		    String id = parts[1];
		    for (int j = 0; j < id_list.length; j++) {
		        if (id.equals(id_list[j])) {
		            yellocard[j]++;
		            break;
		        }
		    }
		});

		result.forEach(reportItem -> {
		    String[] parts = reportItem.split(" ");
		    String id = parts[1];
		    if (yellocard[Arrays.asList(id_list).indexOf(id)] >= k) {
		        String reportedId = parts[0];
		        idMap.put(reportedId, idMap.get(reportedId) + 1);
		    }
		});

		for (int i = 0; i < id_list.length; i++) {
		    answer[i] = idMap.get(id_list[i]);
		}
        return answer;
    }
}