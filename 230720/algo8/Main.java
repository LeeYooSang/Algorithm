package algo8;
//2164

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        int num = 1;
        while(N >= num){
            queue.add(num++);
        }
        while(queue.size() != 1){
            queue.poll();
            int tmp = queue.poll();
            queue.add(tmp);
        }
        System.out.println(queue.peek());
    }
}
