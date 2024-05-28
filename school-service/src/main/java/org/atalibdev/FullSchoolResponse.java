package org.atalibdev;

import lombok.*;
import org.atalibdev.student.Student;

import java.util.List;

/**
 * Created by Almousleck on May, 2024
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FullSchoolResponse {
    private String name;
    private String email;
    List<Student> students;
}
