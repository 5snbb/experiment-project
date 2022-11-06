package com.system.jpa.jpa;

import com.system.jpa.domain.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

/**
 * Author Name: experiment-project
 * Date: 2022/11/6 17:18
 * DAY_NAME: 星期日
 */
public interface CourseJpa extends
        JpaRepository<Course, String>, JpaSpecificationExecutor<Course>, Serializable {
}
