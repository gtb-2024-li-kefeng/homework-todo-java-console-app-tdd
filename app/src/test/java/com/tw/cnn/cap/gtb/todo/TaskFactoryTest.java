package com.tw.cnn.cap.gtb.todo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskFactoryTest {
    @Test
    void should_parse_completed_property_for_task() {
        boolean isCompleted = TaskFactory.createTask("+ foobar", 1).isCompleted();
        assertFalse(isCompleted);
    }

    @Test
    void should_support_name_with_multiple_white_spaces() {
        Task task = TaskFactory.createTask("+    foo  bar   ", 1);
        var name = task.getName();
        assertEquals("   foo  bar   ", name);
    }
}