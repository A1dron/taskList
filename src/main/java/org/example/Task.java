package org.example;

import java.time.LocalDate;


public class Task {

    private final String description;
    private final String startDate;

    public Task(String description) {
        this.description = description;
        this.startDate = LocalDate.now().toString();
    }

    public String getDescription() {
        return description;
    }

    public String getStartDate() {
        return startDate;
    }
}
