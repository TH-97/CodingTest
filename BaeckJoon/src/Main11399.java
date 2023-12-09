import java.util.*;


public class Main11399 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        List<Integer> list_num = new ArrayList<>();
        //list에 추가
        for(int i = 0; i < num;i++){
            list_num.add(sc.nextInt());
        }
        //변수 선언
        int total = 0;
        int sum = 0;
        //정렬
        Collections.sort(list_num);
        //sum에 합친값을 넣고
        //total에 더 해준다
        for(int i = 0 ; i < list_num.size();i++){
                sum = (sum + list_num.get(i));
                total += sum;
        }
        System.out.println(total);

    }
}
