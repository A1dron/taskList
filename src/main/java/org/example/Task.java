package org.example;

import java.time.LocalDate;

public class Task {

    private String description;
    private String startDate;

    public Task() {
    }

    public Task(String description) {
        this.description = description;
        this.startDate = LocalDate.now().toString();
    }

    @Override
    public String toString() {
        return "Task{" +
                "description='" + description + '\'' +
                ", startDate='" + startDate + '\'' +
                '}';
    }

    public String getDescription() {
        return description;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
}
