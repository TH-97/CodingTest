import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;
        int siz = sc.nextInt();
        double[] num_list = new double[siz];
        for(int i = 0 ; i < siz;i++) {
            num_list[i] = sc.nextLong();
        }
        Arrays.sort(num_list);
        for(int i =0; i < num_list.length;i++){
            double long_num = (num_list[i] / num_list[num_list.length-1]) * 100;
            total += long_num;
        }
        System.out.println(total / siz);
    }
}
