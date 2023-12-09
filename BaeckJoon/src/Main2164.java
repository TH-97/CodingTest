
import java.util.*;
import java.io.*;

public class Main2164 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Queue<Integer> deck = new LinkedList<>();
        for(int i = 1; i <= N;i++){
            deck.add(i);
        }
        while (deck.size() != 1) {
            //반환 값
            deck.poll();
            //반환값 가져오기
            int temp = deck.poll();
            //값 추가
            deck.add(temp);
        }
        System.out.println(deck.poll());
    }
}

