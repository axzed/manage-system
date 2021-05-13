package com.itheima.edu.info.manager.dao;

import com.itheima.edu.info.manager.domain.Student;

public class StudenttDao {
    public boolean addStudent(Student stu) {
        //1.创建学生对象数组
        Student[] stus = new Student[5];
        //2.添加学生到数组
        //2.1定义变量index为-1，假设数组已经全部存满，没有null的元素
        int index = -1;
        //2.2遍历数组取出每一个元素，判断是否是null
        for (int i = 0; i < stus.length; i++) {
            Student student = stus[i];
            if(student == null){
                index = i;
                //2.3如果为null，让index变量记录为当前索引位置，并使用break结束循环遍历
                break;
            }
        }
        //3.返回是否添加成功的Boolean值
        if(index == -1){
            //装满了
            return false;
        }else{
            //没装满
            stus[index] = stu;
            return true;
        }
    }
}
