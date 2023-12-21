import java.util.*;

public class Main2606 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int com = sc.nextInt();
        int res = sc.nextInt();// 반복할 값이자 map의 크기
        int[][] arr = new int[res][2];

        Set<Integer> num_list = new HashSet<>();
        num_list.add(1);

            for (int i = 0; i < res; i++) {
                int num = sc.nextInt();
                int num2 = sc.nextInt();
                arr[i][0] = num;
                arr[i][1] = num2;
                if (num_list.contains(num)) num_list.add(num2);
                if (num_list.contains(num2)) num_list.add(num);
            }
            for (int i = res - 1; i > -1; i--) {
                if (num_list.contains(arr[i][0])) num_list.add(arr[i][1]);
                if (num_list.contains(arr[i][1])) num_list.add(arr[i][0]);
            }
            System.out.println(num_list.size() - 1);
        //변경할겁니다
    }

}
