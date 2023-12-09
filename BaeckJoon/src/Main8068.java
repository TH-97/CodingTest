import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main8068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int siz = sc.nextInt();
        String OX = "";
        for(int i = 0; i < siz; i++) {
            OX = sc.next();

            String[] OX_split = OX.split("");
            int[] total_list = new int[OX_split.length];
            int count = 1;
            for (int j = 0; j < OX_split.length; j++) {
                if (OX_split[j].equals("O")) {
                    total_list[j] += count;
                    count++;
                } else if (OX_split[j].equals("X")) {
                    total_list[j] = 0;
                    count = 1;
                }
            }
            int answer = 0;
            for (int z = 0; z < total_list.length; z++) answer += total_list[z];
            System.out.println(answer);
        }
    }

}

