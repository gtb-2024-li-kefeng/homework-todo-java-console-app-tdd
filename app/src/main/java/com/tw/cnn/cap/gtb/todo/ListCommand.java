package com.tw.cnn.cap.gtb.todo;

import java.util.ArrayList;
import java.util.List;

public class ListCommand {
    static ArrayList<String> run() {
        List<Task> tasks = TaskRepository.loadTasks(TaskRepository.readTaskLines());
        ArrayList<String> result = new ArrayList<String>();
        Section tbdSection = new Section("# To be done", false);
        Section completedSection = new Section("# Completed", true);
        result.addAll(tbdSection.format(tasks));
        result.addAll(completedSection.format(tasks));
        return result;
    }
}