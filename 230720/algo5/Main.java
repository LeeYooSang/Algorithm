package algo5;
//1940

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] S = new int[N];

        for(int i = 0; i < N; i++){
            S[i] = scanner.nextInt();
        }
        Arrays.sort(S);

        int start_idx = 0;
        int end_idx = N-1;
        int sum = 0;
        int cnt = 0;

        while(start_idx != end_idx){
            sum = S[start_idx] + S[end_idx];
            if(sum > M)
                end_idx--;
            else if(sum < M)
                start_idx ++;
            else if(sum == M){
                cnt++;
                start_idx++;
            }
        }
        System.out.println(cnt);
    }
}
