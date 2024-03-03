import java.util.*;
import java.util.stream.Collectors;

public class SpaceSeparated {
    public static void main(String[] args) {
       String A = "the sky is blue";
       String [] spli=A.split(" ");
       List<String> str=Arrays.stream(spli).filter(Objects::nonNull).map(a -> a+ " ").toList().reversed();
//        Collections.reverse(str);
//        StringBuffer a= new StringBuffer();
//        str.stream().forEach(st -> {a.append(st);a.append(" ");});
       str.forEach(System.out::print);

    }
}
