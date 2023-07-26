package com.studentcrud.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.studentcrud.domain.Student;

@Repository
public interface StudentRespository extends JpaRepository<Student, Long> {

}
