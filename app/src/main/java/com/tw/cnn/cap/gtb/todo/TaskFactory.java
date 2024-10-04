package com.tw.cnn.cap.gtb.todo;

public class TaskFactory {

    private TaskFactory() {
    }

    static Task createTask(String line, int id) {
        String[] fields = line.split(" ", 2);
        String name = fields[1];
        boolean isCompleted = "x".equals(fields[0]);
        return new Task(id, name, isCompleted);
    }
}