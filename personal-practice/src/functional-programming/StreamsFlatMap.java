import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;


class Students{
    int id;
    String name;
    char grade;

    Students(String name,int id, char grade){
        this.id = id;
        this.name = name;
        this.grade = grade;
    }
}

public class StreamsFlatMap {
    //allows you to read the data as multiple streams instead of Map which returns just one collection
    //map does not change the structure of the stream
    //FLATMAP IS FOR ONE TO MANY TRANsfoRMAtions DEALING WITH NESTED COLLECTIONS
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(1,2,3,4,5,5);
        
        List<Integer> numPlusTen = numList.stream().map(n -> n+10).collect(Collectors.toList());
        System.out.println(numPlusTen); //[11, 12, 13, 14, 15, 15]

        List<Integer> list1 = Arrays.asList(1,2);
        List<Integer> list2 = Arrays.asList(3,4);
        List<Integer> list3 = Arrays.asList(5,6);

        List<List<Integer>> allList = Arrays.asList(list1,list2,list3);
        System.out.println(allList); //[[1, 2], [3, 4], [5, 6]]

        //FLATMAP returns a single list with everything 
        List<Integer> finalList = allList.stream()
                                    .flatMap(lst -> lst.stream())
                                    .collect(Collectors.toList());
        System.out.println(finalList); //[1, 2, 3, 4, 5, 6]

        //MAP CANNOT CHANGE STRUCTURE OF STREAM SO RETURNS A LIST OF LIST
        List<List<Integer>> finalMapList = allList.stream()
                                            .map(lst -> lst)
                                            .collect(Collectors.toList()); 
        System.out.println(finalMapList); //[[1, 2], [3, 4], [5, 6]] - cannot return just a list

        //FLATMAP WITH TRANFORMATION:: ADD 10 TO EACH ELEMENT
        List<Integer> finalTransformList = allList.stream()
                                    .flatMap(lst -> lst.stream())
                                    .map(i -> i+10)
                                    .collect(Collectors.toList());
        System.out.println(finalTransformList); //[11, 12, 13, 14, 15, 16]





        List<String> teamA = Arrays.asList("Cynthia", "Kandy", "Kim F");
        List<String> teamB = Arrays.asList("Kenya", "Porsha");
        List<String> teamC = Arrays.asList("Nene", "Sheree", "Phaedra", "Marlo");

        //To add into one big collection : create list of list of strings then- use Flatmap
        List<List<String>> rhoa = Arrays.asList(teamA, teamB, teamC);

        List<String> rhoas = rhoa.stream()
                                .flatMap(s -> s.stream())
                                .map(s -> s) //not needed since it isnt transforming anything
                                .collect(Collectors.toList());
        System.out.println(rhoas); //[Cynthia, Kandy, Kim F, Kenya, Porsha, Nene, Sheree, Phaedra, Marlo]        

        //CAN ALSO BE WRITTEN AS:
        List<String> rhoaCast = rhoa.stream()
                                .flatMap(Collection::stream)
                                .collect(Collectors.toList());
        System.out.println(rhoaCast); //[Cynthia, Kandy, Kim F, Kenya, Porsha, Nene, Sheree, Phaedra, Marlo]        




        
            //FLATMAP AND MAP _ GET JUST THE STUDENT NAMES
        List<Students> studentListA = Arrays.asList(
                                    new Students("Cynthia", 1, 'A'), 
                                    new Students("Kandy", 2, 'B'),
                                    new Students("Kim F", 3, 'B'));
        List<Students> studentListB = Arrays.asList(
                                    new Students("Marlo",13, 'F'), 
                                    new Students("Nene", 12, 'F'),
                                    new Students("Sheree", 100, 'L'));

        List<List<Students>> studentList =  Arrays.asList(studentListA, studentListB);

        List<String> studentNames = studentList.stream().flatMap(Collection::stream)
                                                .map(s -> s.name).collect(Collectors.toList());

        System.out.println(studentNames); //[Cynthia, Kandy, Kim F, Marlo, Nene, Sheree]
    }
}
