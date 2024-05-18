package com.edu.ctbu.student.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@TableName(value = "student", schema = "student")
public class Student {
    @TableId
    private  String id;
    private String name;
}
