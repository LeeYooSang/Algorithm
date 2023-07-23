package algo13;
//2178

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0 ,-1, 0};
    static int N,M;
    static int[][] arr;
    static boolean[][] isVisited;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();
        arr = new int[N][M];
        isVisited = new boolean[N][M];
        for(int i = 0; i < N; i++){
            char[] str = scanner.next().toCharArray();
            for(int j = 0; j < M; j++){
                arr[i][j] = str[j] - '0';
            }
        }
        BFS(0, 0);
        System.out.println(arr[N-1][M-1]);
    }

    private static void BFS(int i, int j) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {i,j});
        isVisited[i][j] = true;
        while(!queue.isEmpty()){
            int[] now = queue.poll();
            for(int k=0; k<4; k++){     //상하좌우 탐색
                int x = now[0] + dx[k];
                int y = now[1] + dy[k];
                if(x >= 0 && y >= 0 && x < N && y < M){     //배열을 넘어가면 안되고
                    if(arr[x][y] != 0 && !isVisited[x][y]) {  //0이여서 갈 수 없거나 방문하지 않은 곳
                        isVisited[x][y] = true;
                        arr[x][y] = arr[now[0]][now[1]] + 1;
                        queue.add(new int[] {x,y});
                    }
                }
            }

        }
    }
}
