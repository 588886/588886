import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int count = 0;
        boolean[] isComposite = new boolean[num + 1];
        isComposite[0] = isComposite[1] = true;

        for (int i = 2; i * i <= num; i++) {
            if (!isComposite[i]) {
                for (int j = i * i; j <= num; j += i) {
                    isComposite[j] = true;
                }
            }
        }

        int[] primes = new int[num + 1];
        int index = 0;
        for (int i = 2; i <= num; i++) {
            if (!isComposite[i]) {
                primes[index++] = i;
            }
        }

        for (int start = 0; start < index; start++) {
            int sum = 0;
            for (int end = start; end < index && sum < num; end++) {
                sum += primes[end];
                if (sum == num) {
                    count++;
                }
            }
        }
        System.out.println(count);
        sc.close();
    }
}