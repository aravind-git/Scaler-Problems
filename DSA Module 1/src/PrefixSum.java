import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;

public class PrefixSum {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(4);
        A.add(-1);
        A.add(1);
        ArrayList<Integer> prefixSum = new ArrayList<>();
        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for(int i=1;i<A.size();i++){
            //prefixSum.add(i,prefixSum.get(i-1)+A.get(i));
        }
        prefixSum.stream().forEach(System.out::println);
        for(int a:prefixSum){
            if(hashMap.containsKey(a)){
                hashMap.put(a,hashMap.get(a)+1);
            }else{
                hashMap.put(a,1);
            }
        }
        System.out.println(hashMap.toString());
        int count =0;
        for(int key:hashMap.keySet()){
                if(hashMap.get(key) ==2){
                    count++;
                }
        }
    }
}
