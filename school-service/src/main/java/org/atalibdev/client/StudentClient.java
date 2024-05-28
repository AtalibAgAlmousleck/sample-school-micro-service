package org.atalibdev.client;

import org.atalibdev.student.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * Created by Almousleck on May, 2024
 */

@FeignClient(name = "student-service", url = "${application.config.student-service-url}")
public interface StudentClient {

    @GetMapping("/school/{school-id}")
    List<Student> findAllStudentsBySchool(@PathVariable("school-id") Integer schoolId);
}
