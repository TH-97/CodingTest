import java.util.*;

public class ProLv0 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        int num1 = 1;
        int num2 = 3;
        String num_str ="";
        for(int i: numbers){
            num_str += i + "";
        }
        String str_sub = num_str.substring(num1,num2+1);
        List<Integer> num_list = new ArrayList<>();
        for(int i = 0; i < str_sub.length(); i++){
            num_list.add(str_sub.charAt(i) - '0');
        }
        int[] answer = new int[num_list.size()];
        for(int i = 0; i < num_list.size();i++){
            answer[i] = num_list.get(i);
        }
        System.out.println(Arrays.toString(answer));
    }
}
