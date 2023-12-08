import java.util.*;
class Solution {
    public int[] solution(int[] array) {
        int[] arr=array.clone();
		Arrays.sort(arr);
        int a=0;
        for(int i=0;i<arr.length;i++){
            if(array[i]==arr[arr.length-1]){
                a=i;
            }
        }
        int[] answer = {arr[arr.length-1],a};
        return answer;
    }
}