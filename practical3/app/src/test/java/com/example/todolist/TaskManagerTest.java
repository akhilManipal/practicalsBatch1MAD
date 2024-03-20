package com.example.todolist;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import java.util.List;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class TaskManagerTest {
    private TaskManager taskManager;

    @Before
    public void setUp() {
        taskManager = new TaskManager();
    }

    @Test
    public void addTask_addsNonEmptyTask() {
        taskManager.addTask("Read book");
        List<String> tasks = taskManager.getTasks();
        assertTrue("List should contain 'Read book'", tasks.contains("Read book"));
    }

    @Test
    public void addTask_ignoresEmptyTask() {
        taskManager.addTask(" ");
        assertTrue("List should be empty for blank task", taskManager.getTasks().isEmpty());
    }

    @Test
    public void removeTask_removesTaskCorrectly() {
        taskManager.addTask("Buy milk");
        taskManager.addTask("Call mom");
        taskManager.removeTask(0); // Attempt to remove "Buy milk"
        assertFalse("List should not contain 'Buy milk'", taskManager.getTasks().contains("Buy milk"));
        assertTrue("List should contain 'Call mom'", taskManager.getTasks().contains("Call mom"));
    }

    @Test
    public void removeTask_handlesInvalidPosition() {
        taskManager.addTask("Workout");
        assertFalse("Removing invalid position should return false", taskManager.removeTask(10));
    }
}