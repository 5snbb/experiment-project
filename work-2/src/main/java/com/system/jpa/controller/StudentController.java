package com.system.jpa.controller;

import com.system.jpa.domain.Student;
import com.system.jpa.jpa.StudentJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Author Name: experiment-project
 * Date: 2022/11/6 16:57
 * DAY_NAME: 星期日
 */

@RestController
@RequestMapping("/stu")
public class StudentController {
    @Autowired
    private StudentJpa studentJpa;
    /**
     * 查询所有的学生
     *
     * @return
     */
    @GetMapping("/findAll")
    public List<Student> findAll() {
        return studentJpa.findAll();
    }
    /**
     * 添加、更新用户
     *
     * @param student
     * @return
     */
    @PostMapping("/save")
    public Student save(Student student) {
        return studentJpa.save(student);
    }
    /**
     * 通过id删除学生
     *
     * @param id
     */
    @PostMapping("/delete/{id}")
    public void deleteById(@PathVariable String id) {
        System.out.println("删除学生");
        studentJpa.deleteById(id);
    }
}
