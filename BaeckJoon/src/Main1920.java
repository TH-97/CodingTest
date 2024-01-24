import java.util.Arrays;
import java.util.Scanner;

public class Main1920 {
    static Scanner sc = new Scanner(System.in);
    static int[] arr = new int[sc.nextInt()];

    public static void main(String[] args) {

        for(int i = 0; i < arr.length;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        //
        int target_size = sc.nextInt();
        //찾는 값 이 arr에 있는지 확인 (이진탐색을 이용한)
        for(int i = 0; i< target_size; i++){
            int target = sc.nextInt();
            int start = 0;
            int end = arr.length -1;

            System.out.println(binary_Search(target, start, end));

        }
    }
    static int binary_Search(int target, int start, int end){
        int mid;
        while(start <= end){
            mid = (start + end) / 2;
            if(target == arr[mid]){
                return 1;
            } else if(target < arr[mid]){
                end = mid -1;
            } else{
                start = mid +1;
            }
        }
       return 0;
    }
}
