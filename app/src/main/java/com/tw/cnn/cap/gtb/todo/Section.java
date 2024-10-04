package com.tw.cnn.cap.gtb.todo;

import java.util.ArrayList;
import java.util.List;

public class Section {
    private final String title;
    private final boolean flag;

    public Section(String title, boolean flag) {
        this.title = title;
        this.flag = flag;
    }

    static Section completed() {
        return new Section("# Completed", true);
    }

    public static Section tbd() {
        return new Section("# To be done", true);
    }

    List<String> format(List<Task> tasks) {
        List<String> result = new ArrayList<>();
        result.add(title);

        tasks.stream()
                .filter(this::isTypeMatched)
                .map(Task::format)
                .forEach(result::add);
        if (result.size() == 1) {
            result.add("Empty");
        }
        return result;
    }

    private boolean isTypeMatched(Task task) {
        return flag == task.isCompleted();
    }


    public String getTitle() {
        return title;
    }



    public boolean isFlag() {
        return flag;
    }
}
