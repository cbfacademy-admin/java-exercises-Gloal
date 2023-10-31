import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsMap {
//Map will transform the data so whatever comes after it is the transformed values only


    public static void main(String[] args) {
        List<String> wordsList = Arrays.asList("Cup", null, "forest", "", "sky", "book", null, "Theatre", "");
        List<String> wordsListInUpperCase = new ArrayList<String>();

        wordsListInUpperCase = wordsList.stream()
                .filter(s -> s != null && !s.isEmpty())
                .map(s -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println(wordsListInUpperCase); // returns [CUP, FOREST, SKY, BOOK, THEATRE]


        // print the length of each string in wordsList but if null then throws exception
        try {
            wordsList.stream()
                    .map(word -> word.toUpperCase()).collect(Collectors.toList())
                    .forEach(System.out::println);
        } catch (Exception e) {
            System.out.println(e.getMessage()); // returns Cannot invoke "String.toUpperCase()" because "word" is null
        }

        // print the length of each string in wordsList that isnt null - if null, you'll get error
        try {
            wordsList.stream()
                    .filter(w -> w!=null)
                    .map(word -> word.length()).collect(Collectors.toList())
                    .forEach(len -> System.out.println(len));
        } catch (Exception e) {
            System.out.println(e.getMessage()); // returns 3 6 0 3 4 7 0
        }



        //DO CALCULATION ON LIST
        List<Integer> numList = Arrays.asList(2,4,5,6,8);
        List<Integer> numbersByThree = new ArrayList<>();

        numbersByThree = numList.stream().map(i -> i*3).collect(Collectors.toList());
        System.out.println(numList);
        System.out.println(numbersByThree);

    }

}
