package com.example.taskManager.controller;

import com.example.taskManager.entity.TaskEntity;
import com.example.taskManager.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/v1/admin")
@RequiredArgsConstructor
public class AdminController {

    @GetMapping
    public ResponseEntity<String> sayHello(){
        return ResponseEntity.ok("HI Admin ");
    }

    @Autowired
    private TaskRepository taskRepository;

    @PostMapping("/addTask")
    public String addTask(@ModelAttribute TaskEntity taskEntity){
        taskRepository.save(taskEntity);
        return "ok";
    }

    @GetMapping("/getTask")
    public ResponseEntity getTask(){
        ArrayList<TaskEntity> list = (ArrayList<TaskEntity>) taskRepository.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
