import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumMaxMin {
    static{
        //runs once class loaded to memory !!
        System.out.println("im honored !!");
    }


    public static void main(String[] args) {
        int[]a = {1,2,3,4,5,6,7};
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        System.out.println(Arrays.stream(a)
                .min()
                .getAsInt()
        );

        System.out.println(list.stream()
                .mapToInt(Integer::intValue)
                .min()
                .getAsInt()
        );

        System.out.println(list.stream()
                .collect(Collectors.summarizingInt(Integer::intValue)));


    }
}
