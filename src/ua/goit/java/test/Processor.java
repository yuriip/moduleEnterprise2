package ua.goit.java.test;

import org.junit.Test;
import ua.goit.java.implementations.Executor;
import ua.goit.java.implementations.Task;
import ua.goit.java.interfaces.ExecutorImpl;
import ua.goit.java.interfaces.LongTask;
import ua.goit.java.interfaces.NumberValidator;

import java.util.List;

public class Processor {

    @Test
    public void test(List<Task<Integer>> intTasks) {
        Executor<Number> numberExecutor = new ExecutorImpl();

        for (Task<Integer> intTask : intTasks) {
            numberExecutor.addTask(intTask);
        }
        numberExecutor.addTask(new LongTask(10L), new NumberValidator());

        numberExecutor.execute();

        System.out.println("Valid results:");
        for (Number number : numberExecutor.getValidResults()) {
            System.out.println(number);
        }
        System.out.println("Invalid results:");
        for (Number number : numberExecutor.getInvalidResults()) {
            System.out.println(number);
        }
    }
}
