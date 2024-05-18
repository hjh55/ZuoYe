package com.edu.ctbu.student.model;

import lombok.Data;

@Data
public class ResponseVO<T> {
    Integer code;
    String msg;
    boolean success;

    T data;
    private ResponseVO(T data){
        this.code=200;
        this.msg="OK";
        this.data=data;
        this.success=true;

    }
    private ResponseVO(Integer code,String msg){
        this.code=code;
        this.msg=msg;
        this.success=false;
    }
    public static ResponseVO<?> SUCCESS(Object data) {
        return new ResponseVO<>(data);
    }
    public static ResponseVO<?> SUCCESS() {
        return new ResponseVO<>(null);
    }
    public static ResponseVO<?> FAIL() {
        return new ResponseVO<>(500,"系统错误");
    }
    public static ResponseVO<?> FAIL(Integer code,String msg) {
        return new ResponseVO<>(code,msg);
    }
}
