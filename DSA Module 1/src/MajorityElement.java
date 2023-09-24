import java.util.ArrayList;
import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(1);
        A.add(2);
        A.add(1);
        HashMap<Integer,Integer> countMap = new HashMap<>();

        for(Integer a:A){
            if(countMap.containsKey(a)){
                countMap.put(a,countMap.get(a)+1);
            }
            else{
                countMap.put(a,1);
            }
        }
        int finalElement;
        double n = Math.floor(A.size()/2);
        for(Integer a:countMap.keySet()){
            if(a > n){
                finalElement = a;
            }
        }
    }
}
