import java.sql.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Lambda {
    public static void main(String[] args){
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("hello from Runnable");
            }

        };
        runnable.run();

        //Lamda
        Runnable lamdbaRunnable = () -> System.out.println("Hello from Lambda!");
        lamdbaRunnable.run();


        List<String> words = Arrays.asList("apple", "banana", "Cherry", "date");

        //using method reference
        words.forEach(System.out::println);

        words.sort( new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });

        System.out.println(words);

        //lambda
        words.sort((s1, s2)->Integer.compare(s1.length(), s2.length()));
        System.out.println(words);


        Predicate<Integer> isEven = (num) -> num % 2 ==0;

        System.out.println(isEven.test(4));
    }
}
