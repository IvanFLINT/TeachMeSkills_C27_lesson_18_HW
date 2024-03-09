package src.com.teachmeskills.lesson18.task1.runner;

import src.com.teachmeskills.lesson18.task1.service.Service;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Service.inputArray();
        Service.removingDuplicates(Service.inputArray());
        Service.outputElements(Service.inputArray());
        Service.multiplicationElements(Service.inputArray());
        Service.sortingElements(Service.inputArray());
        Service.amountElements(Service.inputArray());
        Service.average(Service.inputArray());
    }
}
