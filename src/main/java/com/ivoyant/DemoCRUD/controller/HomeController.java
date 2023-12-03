package com.ivoyant.DemoCRUD.controller;


import com.ivoyant.DemoCRUD.entity.Student;
import com.ivoyant.DemoCRUD.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HomeController {
    @Autowired
    private StudentRepo studentRepo;

    @GetMapping("/")
    public String index(){
        return "welcome to CRUD Project";
    }
    //for insert data into db
    @PostMapping("/saveStudent")
    public Student saveData(@RequestBody Student student){
        studentRepo.save(student);
        return student;
    }

    //for get all data in db
    @GetMapping("/getAllStu")
    public List<Student> getAll(){
        List<Student> stuList=studentRepo.findAll();
        return stuList;
    }

    //Delete particular data in db
    @DeleteMapping("/deleteStu/{rollNo}")
    public String deleteStudent(@PathVariable int rollNo){
        Student student =studentRepo.findById(rollNo).get();
        if(student!=null){
            studentRepo.delete(student);
        }
        return "Deleted Successful";
    }
    //Update data
    @PutMapping("/updateStu")
    public Student updateStudent(@RequestBody Student student){
        studentRepo.save(student);
        return student;
    }

}
