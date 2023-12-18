import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main10773 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int rep = sc.nextInt();
        List<Integer> num_list = new ArrayList<>();
        for(int i = 0; i < rep; i++){
            int num = sc.nextInt();
            if(num != 0){num_list.add(num);}
            if(num == 0){num_list.remove(num_list.size()-1);}

        }
        int total = 0;
        for(int i : num_list) total += i;
        System.out.println(total);
    }
}
