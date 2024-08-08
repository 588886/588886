import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<N;i++){
            list.add(i+1);
        }
        for(int i=0;i<M;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            Collections.reverse(list.subList(a-1,b));
        }


        sc.close();
        for(int i:list){
            System.out.print(i +" ");
        }
    }

}

