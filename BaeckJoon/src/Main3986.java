import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main3986 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        for(int i = 0 ;i < num; i++) {
            String AB = sc.next();
            String AA = "AA";
            String BB = "BB";

                if(AB.length() % 2 != 0) break
                        ;
                if(AB.contains(AA)){
                    AB.replace(AA,"");
                    count++;
                }
                if(AB.contains(BB)){
                    AB.replace(BB," ");
                    count++;

                }

        }
        System.out.println(count);
    }
}