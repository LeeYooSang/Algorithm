package algo4;
//2018

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int count = 1;
        int sum = 1;
        int start_index = 1;
        int end_index = 1;

        while (end_index != N) {
            if (sum < N) {
                end_index++;
                sum += end_index;
            } else if (sum > N) {
                sum -= start_index;
                start_index++;
            } else if (sum == N) {
                count++;
                end_index++;
                sum += end_index;
            }
        }
        System.out.println(count);
    }
}