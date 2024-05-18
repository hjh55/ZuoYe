package com.edu.ctbu.student.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.edu.ctbu.student.entity.Student;
import com.edu.ctbu.student.entity.Teacher;
import com.edu.ctbu.student.mappper.StudentMapper;
import com.edu.ctbu.student.mappper.TeacherMapper;
import com.edu.ctbu.student.model.StudentVO;
import com.edu.ctbu.student.service.FindService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class FindServiceImpl implements FindService {

    @Autowired
    StudentMapper studentMapper;

    @Autowired
    TeacherMapper teacherMapper;

    @Override
    public List<Student> findAll() {
        return  studentMapper.selectList(null);
    }

    public Student findOne(String id){
        return studentMapper.selectById(id);
    }

    public  Student findOneByName(String name){
        QueryWrapper<Student> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("name",name);
        return  studentMapper.selectOne( queryWrapper);
    }
    @Transactional
    public void delete(String id){
        studentMapper.deleteById(id);
    }
    @Transactional
    public void update(StudentVO studentVO){
        String id =studentVO.getId();
        // 构建查询条件，根据ID查询数据库中对应的记录
        QueryWrapper<Student> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id", id);
        String name =studentVO.getName();
        Student student =new Student();
        student.setId(id);
        student.setName(name);
        studentMapper.update(student,queryWrapper);
    }

    @Transactional
    public void add(StudentVO studentVO){
        Student student = new Student();
        student.setId(studentVO.getId());
        student.setName(studentVO.getName());
        studentMapper.insert(student);
    }









    public List<Teacher> findTeachersByMinIdPrefix() {
        //获取入职最晚教师的前四位
        QueryWrapper<Teacher> queryWrapper = Wrappers.query();
        queryWrapper.orderByDesc("teacher_id").last("LIMIT 1");
        Teacher firstTeacher = teacherMapper.selectOne(queryWrapper);
        String id = firstTeacher.getTeacherId().substring(0, 4);
        // 使用前四位进行模糊查询
        QueryWrapper<Teacher> listWrapper = Wrappers.query();
        listWrapper.likeRight("teacher_id", id);
        List<Teacher> result = teacherMapper.selectList(listWrapper);
        // 返回查询结果列表
        return result;
    }
}
