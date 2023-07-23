package algo16;
//1541

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] str = scanner.next().toCharArray();
        int idx = 0;
        int res = 0;
        boolean isPlus = true;
        for (int i = 0; i < str.length; i++) {
            StringBuffer tmp = new StringBuffer();
            if(str[i] == '+' || str[i] == '-'){
                for (int j = idx; j < i; j++) {
                    tmp.append(str[j]);
                    idx = i + 1;
                }
                int p = Integer.parseInt(String.valueOf(tmp));
                if(str[i] == '-' && isPlus) {
                    isPlus = false;
                    res += p;
                }
                else if(str[i] == '-' && !isPlus){
                    res-=p;
                }
                else if(str[i] == '+' && isPlus)
                    res += p;
                else
                    res-=p;
            }
            else if(i == str.length-1) {
                for (int j = idx; j <= i; j++) {
                    tmp.append(str[j]);
                }
                int p = Integer.parseInt(String.valueOf(tmp));
                if (isPlus)
                    res += p;
                else
                    res -= p;
            }

        }
        System.out.println(res);
    }
}
