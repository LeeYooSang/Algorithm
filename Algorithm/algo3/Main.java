package algo3;
//11659

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        long[] S = new long[N+1];
        S[0] = 0;

        for(int i = 1; i <= N; i++){
            int tmp = scanner.nextInt();
            S[i] = (tmp + S[i - 1]);
        }

        for(int i = 0; i < M; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(S[b]- S[a-1]);
        }

    }
}
