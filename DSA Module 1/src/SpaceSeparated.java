import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SpaceSeparated {
    public static void main(String[] args) {
       String A = "the sky is blue";
       String [] spli=A.split(" ");
       List<String> str=Arrays.stream(spli).collect(Collectors.toList());
        Collections.reverse(str);
        StringBuffer a= new StringBuffer();
        str.stream().forEach(st -> {a.append(st);a.append(" ");});
        System.out.println(a.toString());

    }
}
