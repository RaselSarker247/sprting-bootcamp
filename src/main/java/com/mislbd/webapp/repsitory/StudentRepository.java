package com.mislbd.webapp.repsitory;

import com.mislbd.webapp.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface StudentRepository  extends JpaRepository<Student, Long> {
    Optional<Student> findById(Long id);
}
