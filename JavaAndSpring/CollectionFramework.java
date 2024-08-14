package src.JavaAndSpring;

import src.collection.com.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class CollectionFramework {

    public static void main(String[] args) {

        HashMap<String, Integer> hm = new HashMap<String, Integer>();

//        hm.put("a", 98);
//        hm.put("p", 85);
//        hm.put("c", 91);
//
//        // sort krna h ... keys...
//        List<Integer> sortedkeys = new ArrayList<>(hm.values());
//
//        System.out.println(sortedkeys);
//
//        Collections.sort(sortedkeys);
//        System.out.println(sortedkeys);

//        Map<String, Integer> sortedmmap = new TreeMap<>(Comparator.comparing(hm::get));
//
//       Map<String, Integer> ans =  hm.entrySet()
//                .stream()
//                .sorted(Map.Entry.comparingByKey())
//                .collect(
//                        LinkedHashMap::new,
//                        (map, entry) -> map.put(entry.getKey(), entry.getValue()),
//                        LinkedHashMap::putAll
//                );
//        System.out.println(ans);
//        /// using comparator method...
//
//        hm.entrySet()
//                .stream()
//                .sorted(Map.Entry.comparingByKey())
//                .forEach(e -> sortedmmap.put(e.getKey(), e.getValue()));
//
//        System.out.println(sortedmmap);
//
//        Map<String, Integer> sortedMap = new LinkedHashMap<>();
//
//        hm.entrySet()
//                .stream()
//                .sorted(Map.Entry.comparingByValue())
//                .forEach(e -> sortedMap.put(e.getKey(), e.getValue()));
//
//        System.out.println("hello " + sortedMap);


        // multiple...
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1, "John Doe", 30));
        employees.add(new Employee(2, "Jane Smith", 25));
        employees.add(new Employee(3, "Mike Johnson", 40));

        List<Employee> emp = employees.stream().sorted(
                Comparator.comparing(e-> e.getAge()))
//                        .thenComparing(Employee::getId)
//                        .thenComparing(Employee::getAge))
                .collect(Collectors.toList());


        System.out.println(emp);

    }

}

