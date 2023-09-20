import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.Collections;

class Products{
    int id;
    String name;
    Double price;

    Products(int id, String name, Double price){
        this.id = id;
        this.name = name;
        this.price = price; 
    }

}


public class StreamsFilter {

    //practice funcitonal programing and streams api
    public static void main(String[] args) {
        
            //String hello = (String) -> {System.out.println("Wazzup!!"+String);};

            Map<String, Integer> thisMap = new HashMap<>();
            thisMap.put("Jumbo", 5);


            List<Integer> numbersList = new ArrayList<>(Arrays.asList(1,12,23,34,45,56,67,78));
            List<Integer> evenNUmberList = new ArrayList<>();
            System.out.println(thisMap);

            //without streams
            for(int n: numbersList){
                if(n%2 == 0){evenNUmberList.add(n);
                }
            }
            System.out.println(evenNUmberList);


            //with streams
            evenNUmberList = numbersList.stream().filter( n-> n%2==0).collect(Collectors.toList());
            System.out.println(evenNUmberList);

            //or if you dont want to send it to a list in the first place
            numbersList.stream().filter( n-> n%2!=0).collect(Collectors.toList()).forEach(n -> System.out.println(n));
            //or - Using the System.out static class print method lambda expression - in this case we will print a set (unordered unique values)
            numbersList.stream().filter(n -> n%2==0).collect(Collectors.toSet()).forEach(System.out::print);



            List<String> nameList = Arrays.asList("Jemima", "Gwendolyn", "Veretta", "Ruth", "Gladys");

            //to filter based on name size > 5null
            nameList.stream().filter(s -> s.length()>5).collect(Collectors.toList()).forEach(System.out::println); //Jemima Gwendolyn Veretta Gladys
            //for 6 < names > 8
            nameList.stream().filter(str -> str.length()>6 && str.length()<8).collect(Collectors.toList()).forEach(str -> System.out.println(str)); //Veretta


            //TO FILTER NULLS FROM LIST
            List<String> wordsList = Arrays.asList("Cup", null, "forest", "", "sky", "book", null, "Theatre", "");
            wordsList.stream().filter(s -> s!=null).collect(Collectors.toList()).forEach(System.out::println); //prints Cup forest <space> sky book Theatre <space> where <space == empty line
            //filter nulls and empty strings and assign to list
            List<String> wordsWithoutEmpty = new ArrayList<>();
            wordsWithoutEmpty = wordsList.stream().filter(s -> s!=null && !s.isEmpty()).collect(Collectors.toList());
            wordsWithoutEmpty.forEach(System.out::print); //CupforestskybookTheatre

            
            //FOR FILTERING OBJECTS!!
            List<Products> productList = new ArrayList<Products>();
            
            productList.add(new Products(1, "HP Laptop", 1200.00));
            productList.add(new Products(2, "Lenovo Laptop", 3200.00));
            productList.add(new Products(3, "Dell Laptop", 800.00));
            productList.add(new Products(4, "Sony Laptop", 1700.00));
            productList.add(new Products(5, "Asus Laptop", 950.00));
            productList.add(new Products(6, "Apple Laptop", 2700.00));

            //print each object that has price greater than 2000 - This will just print the product object itself and not the details
            productList.stream()
                        .filter(s -> s.price >2000.00).collect(Collectors.toList())
                        .forEach(System.out::println); //Products@4c873330 Products@119d7047
            
            //print each name that has price greater than 2000
            productList.stream()
                        .filter(p -> p.price >2000.00).collect(Collectors.toList())
                        .forEach(p -> System.out.println(p.name + " costs "+ p.price)); //Lenovo Laptop costs 3200.0 Apple Laptop costs 2700.0


    }


}

