import java.util.*;
public class Main11656 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //입력받기
        String name = sc.next();
        int name_len = name.length();
        //리스트 생성
        List<String> list = new ArrayList<>();
        for(int i = 0; i < name_len ;i++){
            // substring메서드를 이용하여 자르고 넣어주기
            list.add(name.substring(i,name_len));
        }
        //리스트 정렬
        Collections.sort(list);
        for(int i  = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        sc.close();
    }
}