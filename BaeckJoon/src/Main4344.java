import java.util.Arrays;
import java.util.Scanner;

public class Main4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int siz = sc.nextInt();
        //반복할 횟수
        for(int i = 0; i < siz; i++) {

            int student = sc.nextInt(); //학생수
            int[] scores = new int[student];

            //성적 누적 및 성적 누적의 합
            double total = 0;
            for(int j = 0 ; j < student; j ++){
                int score = sc.nextInt();
                scores[j] = score;
                total += score;
            }
            //평균
            double num = (total/student);

            //평균이 넘는 학생 비율
            double count = 0;
            for(int z =0; z < student; z++){
                if (scores[z] > num)
                    count++;
            }
            System.out.printf("%.3f%%\n",(count/student)*100);



        }
    }
}
