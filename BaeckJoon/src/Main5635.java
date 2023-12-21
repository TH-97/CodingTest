import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main5635  {
    public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            String[][] hum_list = new String[n][4];

            for(int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                hum_list[i][0] = st.nextToken();
                hum_list[i][1] = st.nextToken();
                hum_list[i][2] = st.nextToken();
                hum_list[i][3] = st.nextToken();
            }
            Arrays.sort(hum_list, new Comparator<String[]>() {

                public int compare(String[] o1, String[] o2) {
                //o1와 o2는 String이기때문에 equals로 값 비교
                    //년수 비교
                    if(o1[3].equals(o2[3])) {
                        //월 비교
                        if(o1[2].equals(o2[2])) {
                            //일비교
                            return Integer.parseInt(o1[1]) - Integer.parseInt(o2[1]);
                        }
                        return Integer.parseInt(o1[2]) - Integer.parseInt(o2[2]);
                    }
                    return Integer.parseInt(o1[3]) - Integer.parseInt(o2[3]);
                }
            });
            System.out.println(hum_list[n-1][0]);
            System.out.println(hum_list[0][0]);
        }

}

