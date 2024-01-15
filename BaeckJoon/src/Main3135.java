import java.util.*;

public class Main3135 {
    static Scanner sc = new Scanner(System.in);
    static int now = sc.nextInt();
    static int target = sc.nextInt();
    static int res = sc.nextInt(); // 즐겨찾기 숫자
    static int count = 0; //버튼 누른 카운트
    static int min = 1000;
    static List<Integer> des_Hz = new ArrayList<>();

    public static void main(String[] args) {

        Main3135 main = new Main3135();
        main.add();
        if(des_Hz.size() != 1){
            main.find_min();
            if(Math.abs(min - target) < Math.abs(now - target) ){
                now = min;
                count++;
            }

        }
        if(des_Hz.size() == 1){
            if(Math.abs(des_Hz.get(0) - target) < Math.abs(now - target) ){
                now = des_Hz.get(0);
                count++;
            }
        }
        if(target == now) System.out.println(count);
        if(target != now) System.out.println(count + Math.abs(target - now));
    }
    public void add(){
        for(int i = 0; i < res;i++){
            des_Hz.add(sc.nextInt());
        }
    }
    public void find_min(){
        for(int i = 0; i < des_Hz.size() - 1; i++){
            if(Math.abs(des_Hz.get(i) - target) < Math.abs(des_Hz.get(i + 1) -target) && Math.abs(min - target) > Math.abs(des_Hz.get(i) - target)){
               min = des_Hz.get(i);
            }
        }
    }
}

