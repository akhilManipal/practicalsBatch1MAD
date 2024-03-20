package com.example.todolist;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<String> tasks = new ArrayList<>();

    // Adds a task to the list
    public void addTask(String task) {
        if (task != null && !task.trim().isEmpty()) {
            tasks.add(task.trim());
        }
    }

    // Removes a task by its position
    public boolean removeTask(int position) {
        if (position >= 0 && position < tasks.size()) {
            tasks.remove(position);
            return true;
        }
        return false;
    }

    // Getter for tasks
    public List<String> getTasks() {
        return tasks;
    }
}
