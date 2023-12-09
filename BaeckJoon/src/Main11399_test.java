import java.util.*;


public class Main11399_test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        StringBuffer bf = new StringBuffer();
        //list에 추가
        for(int i = 0; i < num;i++){
           bf.append(num);
        }
        //변수 선언
        int total = 0;
        int sum = 0;
        //정렬
        Arrays.sort(bf.toString().toCharArray());
        System.out.println(bf);
        //sum에 합친값을 넣고
        //total에 더 해준다
//        for(int i = 0 ; i < list_num.size();i++){
//            sum = (sum + list_num.get(i));
//            total += sum;
//        }
//        System.out.println(total);

    }
}
