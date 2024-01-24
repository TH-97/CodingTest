import java.util.Scanner;

public class Main2805 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = sc.nextInt();
        int target = sc.nextInt();

        //비교할 값 배열에 넣기
        int[] arr = new int[result];
        int total = 0; //가지고 있는 값의 최대값
        for(int i = 0; i< result ;i++){
            arr[i] = sc.nextInt();
            if(total < arr[i]){
                total = arr[i];
            }
        }
        int start = 0;

        //이진탑색 시작
        while (start < total){
            long total_2 = 0;
            int mid = (start + total) /2;
            for(int i = 0; i < result; i++){
                if(arr[i] - mid > 0) {
                    total_2 += arr[i] - mid;
                }
            }
            // if(target == mid) 가 나오지 않는 이유는 


            if(total_2 < target){
                total = mid;
            }else{
                start = mid+1;
            }
        }
        System.out.println(start-1);
    }
}
