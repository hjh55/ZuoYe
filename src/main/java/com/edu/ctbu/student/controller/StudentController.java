package com.edu.ctbu.student.controller;

import com.edu.ctbu.student.entity.Student;
import com.edu.ctbu.student.entity.Teacher;
import com.edu.ctbu.student.model.ResponseVO;
import com.edu.ctbu.student.model.StudentVO;
import com.edu.ctbu.student.service.FindService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("student")
@RequiredArgsConstructor
public class StudentController {
    @Autowired
    FindService findService;

    @GetMapping(value = "findAll")
    public ResponseVO<?> findAll(){
        List<Student> result = findService.findAll();
        return ResponseVO.SUCCESS(result);
    }
    @GetMapping(value = "findOne/{id}")
    public ResponseVO<?> findOne(@PathVariable String id){
        Student result =findService.findOne(id);
        return  ResponseVO.SUCCESS(result);
    }
    @GetMapping (value = "findOneByName/{name}")
    public ResponseVO<?> findOneByName(@PathVariable String name){
        Student result =findService.findOneByName(name);
        return  ResponseVO.SUCCESS(result);
    }
    @PostMapping(value="delete")
    public ResponseVO<?> delete (@RequestParam String id){
        findService.delete(id);
        return ResponseVO.SUCCESS();
    }
    @PostMapping(value = "/update")
    public ResponseVO<?> update(@RequestBody StudentVO studentVO){
        findService.update(studentVO);
        return ResponseVO.SUCCESS();
    }
    @PostMapping(value = "/add")
    public ResponseVO<?>add(@RequestBody StudentVO studentVO){
        findService.add(studentVO);
        return ResponseVO.SUCCESS();
    }
    @GetMapping(value = "findMax")
    public ResponseVO<?> findMax(){
        List<Teacher> result = findService.findTeachersByMinIdPrefix();
        return ResponseVO.SUCCESS(result);
    }
}
