package com.company.simplerestapi.repository;

import com.company.simplerestapi.domain.MainElement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MainElementRepository extends JpaRepository<MainElement,Integer> {
    MainElement getById(int id);
}
