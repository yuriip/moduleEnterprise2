package ua.goit.java.implementations;

public interface Task<T> {
    // Метода запускает таск на выполнение
    void execute();

    // Возвращает результат выполнения
    Object getResult();
}
