//import java.util.*;
//public class Main1302 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        //팔린책 목록 받아보기
//        String[] book_list = new String[num];
//        for(int i = 0; i < num; i++){
//            String book_name = sc.next();
//            book_list[i] = book_name;
//        }
//        //  저장순서를 지키기 위해 LinkedhashSet 을씀
//        Set<String> book_set = new LinkedHashSet<>(List.of(book_list));
////        for(int i = 0 ; i < book_list.size(); i++){
////            book_set.add(book_list.get(i));
////        }
//        //
//        String[] book_set2 = new String[book_set.size()];
//        int count = 0;
//        for(String i : book_set){
//            book_set2[count] = i;
//        }
//        int[] sell_book = new int[book_set.size()];
//
//        for(int i = 0; i < book_set2.length;i++){
//            for(int j = 0; j < book_list.length;j++){
//                if(book_set2[i].equals(book_list[j])){
//                    sell_book[i]++;
//                }
//            }
//        }
//        int Max = 0;
//        int Min = 1000;
//        for(int i : sell_book){
//            Max = Math.max(i,Min);
//        }
//        System.out.println(book_set2[Max]);
//    }
//}
