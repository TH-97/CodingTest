import java.util.Scanner;

public class Main1417 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] num_list = new int[num];
        for(int i = 0; i < num; i++){
            num_list[i] = sc.nextInt();
        }
        int count = 0;
        int max = 0;
        while (true){
            if(num_list.length == 1) break;
            if(num_list[0] == max) {
                for(int i = 1 ; i< num_list.length; i++){
                    if(num_list[0] == num_list[i]){
                        count++;
                        break;
                    }
                }
                break;
            }
            for (int i = 0; i < num_list.length; i++) {
                if (num_list[i] > max) {
                    max = num_list[i];
                }
            }
            if(num_list[0] != max){
                for(int j = 0; j < num_list.length;j++){
                    if(num_list[j] == max){
                        num_list[j] -= 1;
                        num_list[0] += 1;
                        count++;
                        max = 0;
                        break;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
