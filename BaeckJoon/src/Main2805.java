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
            // if(target == mid) 가 나오지 않는 이유는 최소값을 구해야 하기 때문


            if(total_2 < target){
                total = mid;
                //여기서 정확학 값이 나와도 위의 조건 때문에 else로 가서 +1을 해준다
            }else{
                start = mid+1;
            }
        }
        //그 후 -1 을 해줘서 답을 찾아 낸다
        System.out.println(start-1);
    }
}
