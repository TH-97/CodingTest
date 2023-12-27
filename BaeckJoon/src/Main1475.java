import java.util.*;
public class Main1475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        String[] num_list = num.split("");
        int[] num_list_int = new int[num_list.length];
        for(int i = 0; i < num_list.length; i++){
            num_list_int[i] = Integer.parseInt(num_list[i]);
        }
        int[] count_list = new int[10];
        for(int i = 0; i < num_list.length; i++){
            for(int j = 0; j < 10; j++){
                if(num_list_int[i] == j){
                    if(j == 6){
                        count_list[9]++;
                        count_list[6]++;
                    } else if (j == 9) {
                        count_list[9]++;
                        count_list[6]++;
                    } else {
                        count_list[j]++;
                    }
                }
            }
        }
        if(count_list[9] % 2 != 0)
            count_list[9]++;
        if(count_list[6] % 2 != 0)
            count_list[6]++;
        System.out.println(Arrays.toString(count_list));
        count_list[9] = count_list[9]/ 2;
        count_list[6] = count_list[6]/ 2;
        System.out.println(Arrays.toString(count_list));
        Arrays.sort(count_list);
        System.out.println(count_list[count_list.length -1]);
    }
}
