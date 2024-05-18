package com.edu.ctbu.student.service;

import com.edu.ctbu.student.entity.Student;
import com.edu.ctbu.student.entity.Teacher;
import com.edu.ctbu.student.model.StudentVO;

import java.util.List;

public interface FindService {

    List<Student> findAll();

    Student findOne(String id);

    Student findOneByName(String Name);

    void delete(String id);

    void update(StudentVO studentVO);

    void add(StudentVO studentVO);

    List<Teacher>findTeachersByMinIdPrefix();
}
