package algo7;
//1874

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A[] = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = scanner.nextInt();
        }
        Stack<Integer> stack = new Stack<>();
        int num = 1;
        StringBuffer sb = new StringBuffer();
        boolean result = true;
        for(int i = 0; i < A.length; i++){
            int su = A[i];
            if(su >= num){
                while(su >= num){
                    stack.push(num++);
                    sb.append("+\n");
                }
                stack.pop();
                sb.append("-\n");
            }
            else{
                int n = stack.pop();
                if(n > su) {
                    System.out.println("NO");
                    result = false;
                    break;
                }
                else {
                    sb.append("-\n");
                }
            }
        }
        if(result)
            System.out.println(sb);
    }
}
