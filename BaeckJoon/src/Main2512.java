import java.util.*;

public class Main2512 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int city = sc.nextInt();
        int end = 0;
        int sum = 0;
        int[] want = new int[city];
        for(int i = 0; i < want.length; i++){
            want[i] = sc.nextInt();
            sum += want[i];
            if(end < want[i]) {
                end = want[i];
            }
        }

        int have = sc.nextInt();

        int start = 1;

        while (start <= end ){
            int mid = 0;
            int target = 0;
            if(sum < have) {
                break;
            }else {
                for (int i = 0; i < want.length; i++) {
                    mid = (start + end) / 2;
                    if(want[i] < mid){
                        target += want[i];
                    }else{
                        target += mid;
                    }
                }
                
                if(have <= target){
                    end = mid -1;
                }else{
                    start = mid +1;
                }
            }
        }

        System.out.println(end);

    }
}
