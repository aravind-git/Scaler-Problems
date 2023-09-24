import java.util.ArrayList;

public class ColSum {
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
        A.add(a3);

     //   a3.get(0)

        ArrayList<Integer> a = new ArrayList<>();

        int row = A.size();

        for(int i=0; i<row; i++) {
            int colWiseSum = 0;
            for(int j=0; j<A.get(0).size(); j++) {
                colWiseSum += A.get(j).get(i);
            }
            a.add(colWiseSum);
        }

        a.stream().forEach(System.out::println);

    }
    }
