import java.util.*;

public class Main10816 {
    static Scanner sc = new Scanner(System.in);

    static ArrayList arr = new ArrayList();

    static int[] answer0;

    public static void main(String[] args) {
        //값이 들어있는 배열
        int size = sc.nextInt();
        for(int i = 0; i < size; i++){
            arr.add(sc.nextInt());
        }
        Collections.sort(arr);
        //찾을 값이 들어있는 배열
        int[] target_list = new int[sc.nextInt()];
        for(int i = 0 ;i < target_list.length; i++){
            target_list[i] = sc.nextInt();
        }
        //찾기
        boolean[] answer2 = new boolean[target_list.length];
        int[] answer = new int[target_list.length];
        answer0 = answer;
        for(int i = 0; i < answer.length;i++){
            int target = target_list[i];
            int start = 0;
            int end = arr.size() -1;
            binary_Search(target, start, end);


        }
        for(int i = 0; i < answer.length;i++){
            System.out.print(answer0[i] + " ");
        }
    }
    static int binary_Search(int target, int start, int end){
        int mid;
        while (start <= end){
            mid = (start + end) /2;
            if(arr.get(mid).equals(target)){
                arr.remove(mid);
                return 1;
            } else if (target < (int)arr.get(mid)) {
                end = mid -1;

            }else{
                start = mid +1;
            }
        }
        return 0;
    }

}
