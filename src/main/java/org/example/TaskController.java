package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TaskController {
    @Autowired
    FileService fs;

    @PostMapping("/tasks")
    void addListTask(@RequestBody List<Task> tasks){
        fs.writeToFile(tasks);
    }
}
