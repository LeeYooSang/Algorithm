package algo17;
//1929

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        int N = scanner.nextInt();

        int[] arr = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            arr[i] = i;
        }
        for(int i = 1; i <= Math.sqrt(N); i++){
            if(i == 1) {
                arr[i] = 0;
                continue;
            }
            if(arr[i] == 0)
                continue;
            if(arr[i] != 0){
                for (int j = i + i; j <= N; j = j + i) {
                    arr[j] = 0;
                }
            }
        }
        for (int i = M; i <= N; i++) {
            if(arr[i] != 0)
                System.out.println(arr[i]);
        }
    }
}
