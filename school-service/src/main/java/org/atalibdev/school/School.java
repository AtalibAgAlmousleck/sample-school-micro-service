package org.atalibdev.school;

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
public class School {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String email;
}
