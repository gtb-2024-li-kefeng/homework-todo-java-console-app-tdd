package com.tw.cnn.cap.gtb.todo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;


class TaskRepositoryTest {
    @Test
    void should_parse_completed_property_for_task() {
        boolean isCompleted = TaskFactory.createTask("+ foobar", 1).isCompleted();
        assertFalse(isCompleted);
    }
}