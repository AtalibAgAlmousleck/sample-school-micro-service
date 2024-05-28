package org.atalibdev.school;

import lombok.RequiredArgsConstructor;
import org.atalibdev.FullSchoolResponse;
import org.atalibdev.client.StudentClient;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Almousleck on May, 2024
 */
@Service
@RequiredArgsConstructor
public class SchoolService {

    private final SchoolRepository schoolRepository;
    private final StudentClient client;

    public void saveSchool(School school) {
        schoolRepository.save(school);
    }

    public List<School> findAllSchools() {
        return schoolRepository.findAll();
    }

    public FullSchoolResponse findSchoolsWithStudents(Integer schoolId) {
        var school = schoolRepository.findById(schoolId)
                .orElse(
                        School
                                .builder()
                                .name("School name not found")
                                .email("School email not found")
                                .build());
        var student = client.findAllStudentsBySchool(schoolId);
        return FullSchoolResponse.builder()
                .name(school.getName())
                .email(school.getEmail())
                .students(student)
                .build();
    }
}
