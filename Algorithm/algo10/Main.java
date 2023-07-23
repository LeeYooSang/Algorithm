package algo10;
//2750


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = scanner.nextInt();
        }

        for(int i = 0; i < N-1; i++){
            for(int j = 0; j < N -1 -i; j++){
                if(arr[j] > arr[j+1]){
                    int tmp;
                    tmp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

//        for(int i = 0; i < N-1; i++){
//            for(int j = i + 1; j < N; j++){
//                if(arr[i] > arr[j]){
//                    int tmp;
//                    tmp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = tmp;
//                }
//            }
//        }
        for(int i = 0; i < N; i++){
            System.out.println(arr[i]);
        }
    }
}
