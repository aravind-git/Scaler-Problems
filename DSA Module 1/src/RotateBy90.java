import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class RotateBy90 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer> > A =
                new ArrayList<ArrayList<Integer> >();

        // Create n lists one by one and append to the
        // master list (ArrayList of ArrayList)
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        a1.add(1);
        a1.add(2);
        A.add(a1);

        ArrayList<Integer> a2 = new ArrayList<Integer>();
        a2.add(5);
        a2.add(20);

        A.add(a2);

        ArrayList<Integer> a3 = new ArrayList<Integer>();
        a3.add(10);
        a3.add(20);
        ArrayList<ArrayList<Integer>> rowList = new ArrayList<ArrayList<Integer>> ();

        int row = A.size();
        for(int j=0; j<A.get(0).size(); j++) {
            int colWiseSum = 0;
            ArrayList<Integer> colList = new ArrayList<>();

            for(int i=0; i<row; i++) {
                colList.add(A.get(i).get(j));
            }
            rowList.add(colList);
        }
//
//        for(int i=0;i<rowList.size();i++){
//            Collections.reverse(A.get(i));
//        }
        System.out.println("Before reverse");
        for(int i=0;i<A.size();i++){
                rowList.get(i).stream().forEach(a -> System.out.println(a+ " "));
                System.out.println();

        }
        rowList.stream().forEach(a -> Collections.reverse(a));
        System.out.println("After");
        for(int i=0;i<A.size();i++){
            rowList.get(i).stream().forEach(a -> System.out.println(a+ " "));
            System.out.println();

        }
        /*rowList.stream().forEach(a11 -> Collections.reverse(a1));
        rowList.stream().forEach(a11 -> a11.forEach(System.out::println));

        System.out.println("After");
Collections.reverse(rowList);*/
//        rowList.stream().forEach(a11 -> a11.forEach(System.out::println));

    }

}
