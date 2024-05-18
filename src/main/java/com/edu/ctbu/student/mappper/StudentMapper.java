package com.edu.ctbu.student.mappper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.edu.ctbu.student.entity.Student;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentMapper extends BaseMapper<Student> {
}
