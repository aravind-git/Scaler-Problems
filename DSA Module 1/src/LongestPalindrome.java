import java.util.HashMap;

public class LongestPalindrome {
    public static void main(String[] args) {
        String A = "malayalam";
        /*HashMap<String,Integer> charMap  = new HashMap<String, Integer>();

        for(Character a:A.toCharArray()){
            if(charMap.containsKey(a.toString())){
                charMap.put(a.toString(),charMap.get(a.toString())+1);
            }else{
                charMap.put(a.toString(),1);
            }
        }
        int count = 0;
        int maxOdd = -22;
        StringBuilder finalString= new StringBuilder();
        String oddString = "";
        for(String a:charMap.keySet()){
            if(charMap.get(a)%2==0){
                count +=charMap.get(a);
                finalString.append(a.repeat(charMap.get(a)));
            }else{
                if(maxOdd<charMap.get(a)){
                    maxOdd=charMap.get(a);
                    oddString=a;
                }

            }
        }
        int addMax = Math.max(maxOdd, 0);
        count=count+addMax;
        String finalOne = "";
        finalOne=finalString.substring(0,finalString.length()/2-1);
        finalOne+=oddString.repeat(maxOdd);
        finalOne=finalString.substring(finalString.length()/2-1,finalString.length());
        System.out.println(finalOne);

        System.out.println(count);
        System.out.println(charMap.toString());
    }*/
        longestPalindrome(A);
    }
    static String longestPalindrome(String A){
        String finalOne="";
        for(int i=0;i<A.length();i++){
            for(int j=A.length();j>0;j--){
                if(A.charAt(i)==(A.charAt(j))){
                    StringBuffer a = new StringBuffer();
                    String s = A.substring(i,j);
                    a.append(s);
                    if(a.reverse().equals(a)){
                        finalOne=s;
                        break;
                    }
                }
            }
        }
        return finalOne;
    }
}

