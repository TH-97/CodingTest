import java.util.Scanner;

public class Main2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ran1 = sc.nextInt();
        int ran2 = sc.nextInt();
        int ran3 = sc.nextInt();

        if(ran1 == ran2 && ran1 == ran3) {
            System.out.println(10000 + (ran1) * 1000);
        }else if(ran1 == ran2 && ran1 != ran3) {
            System.out.println(1000 + (ran1) * 100);
        } else if (ran2 == ran3 && ran2 != ran1) {
            
        }
        sc.close();
    }
}
