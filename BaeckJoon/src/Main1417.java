import java.util.Scanner;

public class Main1417 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] num_list = new int[num];
        for(int i = 0; i < num; i++){
            num_list[i] = sc.nextInt();
        }
        int count = 0; //얼마나 매수 했는지
        int max = 0; //배열의 최대값
        while (true){
            //크기가 하나면 끝
            if(num_list.length == 1) break;
            // 다솜이가 max일때
            if(num_list[0] == max) {
                //하지만 다솜이와 같은 값을 가지는 친구가 있다면 count++해주고 끝
                for(int i = 1 ; i< num_list.length; i++){
                    if(num_list[0] == num_list[i]){
                        count++;
                        break;
                    }
                }
                break;
            }
            //최대값 구하기
            for (int i = 0; i < num_list.length; i++) {
                if (num_list[i] > max) {
                    max = num_list[i];
                }
            }
            // 뺐어가져가버리기
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
