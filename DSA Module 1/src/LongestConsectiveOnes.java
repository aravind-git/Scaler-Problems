import java.util.Arrays;
import java.util.HashMap;

public class LongestConsectiveOnes {
    public static void main(String[] args) {
        String A = "000000111111111";
        int ans=0;
        HashMap<Character,Integer> map = new HashMap<>();
        int len = A.length();
        if(!A.contains("0")){
            ans = A.length();
        }
        for(int i=0;i<A.length();i++){
            if(map.containsKey(A.charAt(i))){
                map.put(A.charAt(i),map.get(A.charAt(i))+1);
            }else{
                map.put(A.charAt(i),1);
            }
        }
        for(int i=0;i<len;i++){
            if(A.charAt(i)=='0'){
                int count =0,l=0,r=0,j=i+1,k=i-1;
                while(j<len && A.charAt(j)=='1'){
                    r++;
                    j++;
                }
                while(k>=0 && A.charAt(k)=='1'){
                    l++;
                    k--;
                }
                boolean isTrue=(len-map.get('0')) == (l+r) ;
                count = isTrue ? l+r:l+r+1;
                ans = Math.max(ans,count);
            }
        }

    }
}
