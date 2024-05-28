package org.atalibdev;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Almousleck on May, 2024
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    List<Student> findAllBySchoolId(Integer schoolId);
}
