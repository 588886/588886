import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();

        for(int i=0;i<10;i++){
            int a=sc.nextInt();
            if(list.size()==0 || list.indexOf(a%42)==-1){
                list.add(a%42);
            }
        }

        sc.close();

        System.out.println(list.size());

    }
}