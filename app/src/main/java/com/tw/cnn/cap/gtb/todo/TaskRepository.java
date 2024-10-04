package com.tw.cnn.cap.gtb.todo;

import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    static List<Task> loadTasks(List<String> lines) {
        List<Task> tasks = new ArrayList<>();

        for (int i = 0; i < lines.size(); i++) {
            int id = i + 1;
            String line = lines.get(i);
            tasks.add(TaskFactory.createTask(line, id));
        }
        return tasks;
    }

    static List<String> readTaskLines() {
        try {
            List<String> lines;
            lines = Files.readAllLines(Constants.TASKS_FILE_PATH);
            return lines;
        } catch (IOException e) {
            throw new TodoCannotReadFileException();
        }
    }
}