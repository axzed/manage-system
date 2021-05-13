package com.itheima.edu.info.manager.service;

import com.itheima.edu.info.manager.dao.StudenttDao;
import com.itheima.edu.info.manager.domain.Student;

public class StudentService {
    public boolean addStudent(Student stu) {
        //1. 创建StudentDao（库管）
        StudenttDao studenttDao = new StudenttDao();
        //2. 将学生对象，传递给StudentDao库管中的addstudent方法
        //3.将返回的boolean类型结果，返回给StudentController
        return studenttDao.addStudent(stu);
    }
}
