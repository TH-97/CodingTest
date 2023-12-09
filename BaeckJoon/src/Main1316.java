import java.util.*;

public class Main1316 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int num = sc.nextInt();
        int count =0;
        for(int i = 0; i < num; i++){
            if(check() == true){
                count++;
            }
        }
        System.out.println(count);
    }
    public static boolean check(){
        boolean[] bol = new boolean[26]; //26인 이유는 알파펫이 26개 이기 때문 boolean 초가값은 false
        String str = sc.next();
        int word = 0;
        for(int i = 0; i < str.length(); i++){
            int now = str.charAt(i); // i번째 단어 저장
            //전 단어가 다르다면.
            if(word != now){
                if(bol[now - 'a'] == false){
                    bol[now - 'a'] = true;
                    word = now; //다음 단어를 위해 저장
                }else {
                    return false; //구문이 종료 되면서 check 메서드에 false를 반환 해준다
                }
            }
        }
        return true; // 과정을 모두 통과하면 true를 반환 해준다.
    }
}
