package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
@SpringBootApplication
public class Main {
    @Autowired
    ApplicationContext appContext;

    public static void main(String[] args) {
        SpringApplication.run(Main.class);
    }

//    @Override
//    public void run(String... args) throws Exception {
//        List<Task> t = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            t.add(new Task(String.valueOf(i)));
//        }
//        appContext.getBean(FileService.class).writeToFile(t);
//        List<Task> tasks = appContext.getBean(FileService.class).readFromFile();
//        tasks.forEach(System.out::println);
//    }
}