import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main9375 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int res = sc.nextInt();
        for(int i = 0; i < res; i++){
            Map<String, String> map = new LinkedHashMap<>();
            int res2 = sc.nextInt();
            for(int j = 0; j < res2; j++){
                map.put(sc.next(), sc.next());
            }

        }
    }
}
