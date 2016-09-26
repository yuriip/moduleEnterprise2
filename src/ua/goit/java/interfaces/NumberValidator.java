package ua.goit.java.interfaces;

import ua.goit.java.implementations.Validator;

public class NumberValidator implements Validator {
    @Override
    public boolean isValid(Object result) {
        return false;
    }
}
