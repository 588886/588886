
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String str= sc.next();
        List<String> list=new ArrayList<>();
        for(char i=97;i<123;i++){
            list.add(String.valueOf(i));
        }
        for(int i=0;i< list.size();i++){
            System.out.print(str.indexOf(list.get(i)) + " ");
        }
        sc.close();

    }

}

