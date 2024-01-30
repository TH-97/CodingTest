public class ProLv1_2 {
    public static void main(String[] args) {
        int brown = 24;
        int yellow = 24;

        int width = 0;
        int height = 0;

        for(int i = 2; i <= brown + yellow;i++){
            if((brown + yellow) % i == 0){
                width = i;
                height = (brown + yellow) / i;
            }

            if(width > height){

            }
        }



    }
}
