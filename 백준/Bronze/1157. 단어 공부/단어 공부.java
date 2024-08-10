import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        str=str.toUpperCase();
        Map<String , Integer> alpabat=new HashMap<>();
        for(int i=65;i<91;i++){
         alpabat.put((char)i+"",0);
        }
        for(int i = 0;i<str.length();i++){
            alpabat.put(str.charAt(i)+"",alpabat.get(str.charAt(i)+"")+1);
        }
        List<String> keys = new ArrayList<>(alpabat.keySet());

        Collections.sort(keys, (v2, v1) -> (alpabat.get(v1).compareTo(alpabat.get(v2))));
        if(alpabat.get(keys.get(0)).equals(alpabat.get(keys.get(1)))){

            System.out.println("?");
        }else{
            System.out.println(keys.get(0));
        }
        sc.close();
    }
}