package ua.goit.java.interfaces;

import ua.goit.java.implementations.Executor;
import ua.goit.java.implementations.Task;
import ua.goit.java.implementations.Validator;

import java.util.List;

public class ExecutorImpl implements Executor {

    @Override
    public void addTask(Task task) {

    }

    @Override
    public void addTask(Task task, Validator validator) {

    }

    @Override
    public void execute() {

    }

    @Override
    public List getValidResults() {
        return null;
    }

    @Override
    public List getInvalidResults() {
        return null;
    }
}
