import java.util.Scanner;

public class Main1817 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 책의 개수
        int total_siz = sc.nextInt(); // 최대 무게

        if(a>0) cnt++; // 책이 1개라도 있으면 +1

        for (int i = 0; i < a; i++) {
            int book = sc.nextInt();
            if(setBox(book, total_siz)){
                box = book; // 박스가 최대 무게를 초과하면 다음박스에 담는다
                cnt++;
            }
        }
        System.out.println(cnt);
    }
    static int cnt = 0; // 박수 개수 카운트
    static int box = 0; // 박스의 무게
    // 현재박스에 책을 넣어서 그무게가 상자 최대값보다 큰지 알아내는 메서드
    public static boolean setBox(int book, int total_siz){
        box += book;
        return total_siz < box;
    }
}
