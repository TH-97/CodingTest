public class ProLv1_1 {
    public static void main(String[] args) {
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        int max0 = 0;
        int max1 = 0;
        //가장 큰 값 찾기
        for(int i= 0 ; i < sizes.length;i++){
            if(max0 < Math.max(sizes[i][0],sizes[i][1])){
                max0 = Math.max(sizes[i][0],sizes[i][1]);
            }
            if(max1 < Math.min(sizes[i][0],sizes[i][1])){
                max1 = Math.min(sizes[i][0],sizes[i][1]);
            }
        }

        System.out.println(max0 * max1);

    }
}
