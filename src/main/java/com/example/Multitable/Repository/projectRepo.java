package com.example.Multitable.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.Multitable.Entity.Project;
@Repository
public interface projectRepo extends JpaRepository<Project, Long> {

}
