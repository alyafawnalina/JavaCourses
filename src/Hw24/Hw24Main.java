package Hw24;

import java.util.*;
import java.util.stream.Collectors;

public class Hw24Main {

    public static void main(String[] args) {

        Map<Integer, Customer> customersMap = new HashMap<>();

        List<CustomerWithId> customersListWID = new ArrayList<>(List.of(
                new CustomerWithId("Mike", "Wheeler"),
                new CustomerWithId("Will", "Byers"),
                new CustomerWithId("Max", "Mayfield"),
                new CustomerWithId("Robin", "Buckley"),
                new CustomerWithId("Steve", "Harrington")));

        customersListWID.stream()
                .map(user -> customersMap
                        .put(user.getId(), new Customer(user.getName(), user.getSurname())))
                .collect(Collectors.toList());


        System.out.println("Task 1 \nValues:");
        ArrayList<Customer> values = new ArrayList<>(customersMap.values());
        for (Customer el : values){
            System.out.println(el);
        }
        System.out.println("\n=============");

        System.out.println("\nTask 2 \nKeys: ");
        Set<Integer> keys = customersMap.keySet();
        for (Integer el : keys){
            System.out.println(el);
        }
        System.out.println("\n\n=============");

        System.out.println("\nTask 3");
        Set<Map.Entry<Integer, Customer>> entries = customersMap.entrySet();
        for (Map.Entry<Integer, Customer> el : entries){
            System.out.println(el.getKey() + " --- " + el.getValue());
        }

    }

}
