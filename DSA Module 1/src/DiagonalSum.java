import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class DiagonalSum {
    public static void main(String[] args) {

        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();
        ArrayList<Integer> c = new ArrayList<>();
        A.add(10);
        A.add(20);
        A.add(30);
        A.add(30);
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        B.add(20);
        B.add(30);
        Collections.reverse(A);
            for(int a:A){
                if(hashMap.containsKey(a)){
                    hashMap.put(a,hashMap.get(a)+1);
                }else{
                    hashMap.put(a,1);
                }
            }
            for(int b:B){

                c.add(hashMap.get(b));
            }
    }
}
