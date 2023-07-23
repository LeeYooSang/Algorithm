package algo11;
//1427

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char[] tmp = str.toCharArray();
        int[] num = new int[tmp.length];
        for(int i = 0; i < tmp.length; i++){
            num[i] = tmp[i] - '0';
        }

        for(int i = 0; i < num.length - 1; i++){
            int max = i;
            for(int j = i+1; j < num.length; j++){
                if(num[max] < num[j]){
                    max = j;
                }
            }
            if(max != i){
                int temp = num[i];
                num[i] = num[max];
                num[max] = temp;
            }
        }
        for(int i = 0; i < num.length; i++){
            System.out.print(num[i]);
        }
    }
}
