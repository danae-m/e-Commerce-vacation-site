package com.danaem.javad288.dao;

import com.danaem.javad288.entities.Division ;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface DivisionRepository extends JpaRepository<Division, Long> {
}
