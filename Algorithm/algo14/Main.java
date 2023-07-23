package algo14;
//1920

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] data = new int[N];
        for (int i = 0; i < N; i++) {
            data[i] = scanner.nextInt();
        }
        Arrays.sort(data);
        int M = scanner.nextInt();
        int[] num = new int[M];
        for (int i = 0; i < M; i++) {
            num[i] = scanner.nextInt();

            int start_idx = 0;
            int end_idx = N-1;
            int med = N / 2;


            while (start_idx <= end_idx) {
                if (data[med] < num[i])
                    start_idx = med + 1;
                else if (data[med] == num[i])
                    break;
                else
                    end_idx = med - 1;
                med = (start_idx + end_idx) / 2;
            }
            if (data[med] == num[i])
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}
