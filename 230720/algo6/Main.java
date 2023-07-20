package algo6;
//12891

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int[] checkArr = new int[4];
    static int[] myArr = new int[4];
    static int check = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int S = Integer.parseInt(stringTokenizer.nextToken());
        int P = Integer.parseInt(stringTokenizer.nextToken());
        int result = 0;

        char DNA[] = new char[S];
        DNA = bufferedReader.readLine().toCharArray();
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for(int i = 0; i < 4; i++){
            checkArr[i] = Integer.parseInt(stringTokenizer.nextToken());
            if(checkArr[i] == 0)
                check++;
        }

        for(int i = 0; i < P; i++){
            add(DNA[i]);
        }

        if(check == 4)
            result++;

        for(int i = P; i < S; i++){
            int j = i - P;
            add(DNA[i]);
            del(DNA[j]);
            if(check == 4)
                result++;
        }

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.close();
    }

    private static void del(char c) {
        switch (c){
            case 'A':
                if(myArr[0] == checkArr[0])
                    check--;
                myArr[0]--;
                break;
            case 'C':
                if(myArr[1] == checkArr[1])
                    check--;
                myArr[1]--;
                break;
            case 'G':
                if(myArr[2] == checkArr[2])
                    check--;
                myArr[2]--;
                break;
            case 'T':
                if(myArr[3] == checkArr[3])
                    check--;
                myArr[3]--;
                break;
        }
    }

    private static void add(char c) {
        switch (c){
            case 'A':
                myArr[0]++;
                if(myArr[0] == checkArr[0])
                    check++;
                break;
            case 'C':
                myArr[1]++;
                if(myArr[1] == checkArr[1])
                    check++;
                break;
            case 'G':
                myArr[2]++;
                if(myArr[2] == checkArr[2])
                    check++;
                break;
            case 'T':
                myArr[3]++;
                if(myArr[3] == checkArr[3])
                    check++;
                break;
        }
    }
}
