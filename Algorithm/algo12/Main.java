package algo12;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    static int[][] arr;
    static int[] isVisited;
    static Stack<Integer> stack = new Stack<>();
    static int N,M;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();
        arr = new int[N+1][N+1];
        isVisited = new int[N+1];
        int cnt = 0;
        int done = 0;

        for(int i = 0; i < M; i++){
            int fir = scanner.nextInt();
            int sec = scanner.nextInt();
            arr[fir][sec] = 1;
            arr[sec][fir] = 1;
        }
        for(int i = 0; i < N; i++){
            isVisited[i+1] = 0;
        }

        while(true){
            for(int i = 1; i <= N; i++){
                if(isVisited[i] == 0){
                    stack.push(i);
                    DFS();
                    cnt++;
                }
            }
            break;
        }


        System.out.println(cnt);
    }

    private static void DFS() {
        if(stack.isEmpty())
            return;
        int k = stack.pop();
        for(int i = 1; i <= N; i++){
            if((arr[k][i] != 0) && (isVisited[i] != 1)){
                stack.push(i);
                isVisited[i] = 1;
            }
        }
        DFS();
    }
}
