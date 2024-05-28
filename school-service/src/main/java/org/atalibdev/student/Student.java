package org.atalibdev.student;

import lombok.*;

/**
 * Created by Almousleck on May, 2024
 */


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {
    private String firstname;
    private String lastname;
    private String email;
}
