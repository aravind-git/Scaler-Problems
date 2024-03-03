import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class DiagonalSum {
    public static void main(String[] args) {
        /*
        For a Diagonal the i and j are same. We need to check if the row and col are same and do the Sum
         */
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();

        // Create n lists one by one and append to the
        // master list (ArrayList of ArrayList)
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(1);
        a1.add(2);
        A.add(a1);
        ArrayList<Integer> a2 = new ArrayList<>();
        a2.add(5);
        a2.add(20);
        A.add(a2);
        ArrayList<Integer> a3 = new ArrayList<>();
        a3.add(10);
        a3.add(20);
        A.add(a3);                                
    }
}
