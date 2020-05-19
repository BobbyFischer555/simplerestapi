package com.company.simplerestapi.service.impl;

import com.company.simplerestapi.domain.MainElement;
import com.company.simplerestapi.repository.MainElementRepository;
import com.company.simplerestapi.service.MainElementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainElementServiceImpl implements MainElementService {
    @Autowired
    private MainElementRepository mainElementRepository;
    @Override
    public List<MainElement> getAll() {
        return mainElementRepository.findAll();
    }
}
