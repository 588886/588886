import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int x=sc.nextInt();
        double[] list=new double[x];
        for(int i=0;i<x;i++){
            list[i]=sc.nextDouble();
        }
        Arrays.sort(list);
        double y= 0.0;
        for(int i=0;i<x;i++){
            y+=list[i]/list[x-1]*100;
        }
        System.out.println(y/x);

        sc.close();

    }

}

