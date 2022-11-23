package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

@Component
public class FileService {
    private final ObjectMapper om = new ObjectMapper();
    private final String filename = "taskList.json";

    public void writeToFile(List<Task> task) {      //доработать для дозаписи данных в файл
        task.addAll(readFromFile());
        try {
            om.writeValue(Paths.get(filename).toFile(), task);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Task> readFromFile(){
        List<Task> tasks = null;
        try {
            tasks = Arrays.asList(om.readValue(Paths.get(filename).toFile(), Task[].class));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return tasks;
    }
}
