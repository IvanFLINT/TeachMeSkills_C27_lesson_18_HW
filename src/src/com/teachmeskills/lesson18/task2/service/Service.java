package src.com.teachmeskills.lesson18.task2.service;

import src.com.teachmeskills.lesson18.task2.constant.C27onlGroup;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

/**
 * The Service class consists of a service method that processes the file.
 * The selectionNames method selects all names starting with "a" (regardless of upper/lower case letters).
 * The listSorting method sorts and displays the first element of the collection
 */
public class Service {
    public static Set<String> service() {
        Set<String> st = new HashSet<>();
        File dir = new File(C27onlGroup.GROUP);
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(dir));
        } catch (Exception e) {
            System.out.println("File does not exist");
        }
        String list;
        while (true) {
            try {
                if (!((list = br.readLine()) != null)) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            st.add(list);
        }
        try {
            br.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return st;
    }

    public static void selectionNames(Set<String> list) {
        Stream<String> stream = list.stream()
                .filter(name -> name.toLowerCase().startsWith("а"));
        stream.forEach((e) -> System.out.print(e + ", "));
        System.out.println();
    }

    public static void listSorting(Set<String> list) {
        System.out.println("First element: " + list.stream().sorted().findFirst().get());
    }
}
