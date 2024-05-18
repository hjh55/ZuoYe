package com.edu.ctbu.student.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@TableName(value = "teacher", schema = "student")
public class Teacher {
    @TableId
    private String teacherId;
    private String name;
}
