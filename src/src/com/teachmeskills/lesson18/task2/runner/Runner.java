package src.com.teachmeskills.lesson18.task2.runner;

import src.com.teachmeskills.lesson18.task2.service.Service;

import java.io.IOException;

/**
 * The Runner class in the main method calls the service method to process the list
 */
public class Runner {
    public static void main(String[] args) throws IOException {
        try {
            Service.selectionNames(Service.service());
            Service.listSorting(Service.service());
        } catch (Exception e) {
            System.out.println("File not found");
        }
    }
}
