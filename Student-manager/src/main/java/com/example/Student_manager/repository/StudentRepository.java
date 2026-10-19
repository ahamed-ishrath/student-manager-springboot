package com.example.Student_manager.repository; 
  
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Student_manager.model.Student; 
  

 
public interface StudentRepository extends JpaRepository<Student, Long> { 
  
    boolean existsByEmail(String email); 
  
    boolean existsByEmailAndIdNot(String email, Long id); 
} 
