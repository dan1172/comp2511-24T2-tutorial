package stream;

import java.util.*;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<String>(
            Arrays.asList(new String[] { "1", "2", "3", "4", "5" })
        );
        // for (String string : strings) {
        //     System.out.println(string);
        // }
	
        strings.stream().forEach(x -> {
            int num = Integer.parseInt(x);
            System.out.println(num + 1);
        });
 
        // List<Integer> parsedStrings = strings.stream().map(x -> Integer.parseInt(x)).collect(Collectors.toList());
    }
}
