import java.util.Scanner;

public class Main1543 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        String re_str = sc.nextLine();
        String str = sc.nextLine();

        while (true){
            if(re_str.contains(str)) {
                re_str = re_str.replaceFirst(str, " ");
                count++;
            }
            else{
                break;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
