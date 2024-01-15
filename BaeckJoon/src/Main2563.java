import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main2563 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        int num = sc.nextInt();
        //넣어줄 2차원 배열 만들기
        int[][] arr = new int[100][100];
        for(int i = 0; i < num; i++){
            int bottom = sc.nextInt();
            int top = sc.nextInt();
            // 배열에 값 넣어주기 +10씩
            for(int j = bottom; j < bottom + 10;j++) {
                for(int z = top; z < top + 10;z++) {
                    arr[j][z] = 1;

                }
            }

        }
        // 값 넣어준것 찾아서 count 올리기
        for(int j = 0; j < 100;j++) {
            for(int z = 0; z < 100;z++) {
                if(arr[j][z] == 1){
                    count++;
                }

            }
        }
        System.out.println(count);

    }
}
