package algo2;
//1546

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        int max = -1;

        for(int i = 0; i < n; i++){
            int tmp = scanner.nextInt();
            sum += tmp;
            if(tmp > max)
                max = tmp;
        }
        double res = (double)sum / max * 100 / n;
        System.out.println(res);
    }
}
