import java.util.Arrays;

public class ProLv1_2 {
    public static void main(String[] args) {
        int brown = 8;
        int yellow = 1;

        int width = 0;
        int height = 0;

        for(int i = 2; i <= brown + yellow;i++){
            if((brown + yellow) % i == 0){
                width = i;
                height = (brown + yellow) / i;
            }

            if(width >= height){
                if((width - 2) * (height - 2) == yellow){
                    int[] arr = {width, height};
                    System.out.println(Arrays.toString(arr));
                    return;
                }
            }
        }



    }
}
