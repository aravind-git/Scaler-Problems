import java.util.ArrayList;

public class RowSum {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> A =
                new ArrayList<>();

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
        int row = A.size();
        int col = A.getFirst().size();
        for(int i=0;i<row;i++){
            int sum =0;
            for(int j=0;j<col;j++){
                sum+=A.get(i).get(j);
            }
            System.out.println(sum);
        }
    }
}
