package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

import java.nio.file.Paths;
import java.util.List;

@Component
public class FileService {
    private final ObjectMapper om = new ObjectMapper();

    public void writeToFile(List<Task> task) {
        try {
            om.writeValue(Paths.get("Tasks.json").toFile(), task);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
