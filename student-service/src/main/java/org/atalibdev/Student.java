package org.atalibdev;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

/**
 * Created by Almousleck on May, 2024
 */

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {
    @Id
    @GeneratedValue
    private Integer id;
    private String firstname;
    private String lastname;
    private String email;
    private Integer schoolId;
}
