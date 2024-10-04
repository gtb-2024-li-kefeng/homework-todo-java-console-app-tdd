package com.tw.cnn.cap.gtb.todo;

public class Task {
    private final int id;
    private final String name;
    private boolean isCompleted;

    public Task(int id, String name, boolean isCompleted) {
        this.id = id;
        this.name = name;
        this.isCompleted = isCompleted;
    }

    String format() {
        return String.format("%d %s", this.id, this.name);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isCompleted() {
        return this.isCompleted;
    }
}
