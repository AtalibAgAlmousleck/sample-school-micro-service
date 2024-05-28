package org.atalibdev.school;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Almousleck on May, 2024
 */
@Repository
public interface SchoolRepository extends JpaRepository<School, Integer> {
}
