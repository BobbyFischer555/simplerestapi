package com.company.simplerestapi.repository;

import com.company.simplerestapi.domain.Insurer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InsurerRepository extends JpaRepository<Insurer,Integer> {
}
